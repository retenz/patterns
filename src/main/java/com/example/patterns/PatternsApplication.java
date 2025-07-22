package com.example.patterns;

import com.example.patterns.adapter.LegacyPrinter;
import com.example.patterns.adapter.ModernPrinter;
import com.example.patterns.adapter.PrinterAdapter;
import com.example.patterns.builder.builders.PizzaBuilder;
import com.example.patterns.builder.domain.Pizza;
import com.example.patterns.chainOfResponsobility.AuthenticationHandler;
import com.example.patterns.chainOfResponsobility.AuthorizationHandler;
import com.example.patterns.chainOfResponsobility.Handler;
import com.example.patterns.chainOfResponsobility.LoggingHandler;
import com.example.patterns.command.*;
import com.example.patterns.composite.File;
import com.example.patterns.composite.Folder;
import com.example.patterns.composite.Item;
import com.example.patterns.decorator.CoffeeWithMilkDecorator;
import com.example.patterns.decorator.CoffeeWithSugarDecorator;
import com.example.patterns.decorator.Coffee;
import com.example.patterns.observer.Agency;
import com.example.patterns.observer.NewsAgency;
import com.example.patterns.observer.Channel;
import com.example.patterns.observer.NewsChannel;
import com.example.patterns.proxy.Image;
import com.example.patterns.proxy.ImageProxy;
import com.example.patterns.state.OrderProcessor;
import com.example.patterns.state.OrderStatus;
import com.example.patterns.state.orders.NewOrder;
import com.example.patterns.strategy.CreditCardPayment;
import com.example.patterns.strategy.CryptoPayment;
import com.example.patterns.strategy.PayPalPayment;
import com.example.patterns.strategy.PaymentProcessor;
import com.example.patterns.templateMethod.CoffeeCreator;
import com.example.patterns.templateMethod.DrinkCreator;
import com.example.patterns.templateMethod.TeaCreator;
import com.example.patterns.visitor.Book;
import com.example.patterns.visitor.ShoppingCart;
import com.example.patterns.visitor.visitors.ProductCostVisitor;
import com.example.patterns.visitor.visitors.RubbleProductCostVisitor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.awt.image.BufferedImage;

@SpringBootApplication
public class PatternsApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatternsApplication.class, args);

//		1.3 Паттерн builder
//		Из интересного: можно создать билдер отдельным публичным классом, а можно вложенным статическим внутри нашего Product (в данном случае pizza)
        Pizza pizza = new PizzaBuilder()
                .addCheese("голубой сыр")
                .addMushroom("белый гриб")
                .addTomato("помидорчик")
                .build();
        System.out.println(pizza.toString());

        Pizza staticPizza = new Pizza.PizzaBuilder()
                .addCheese("голубой сыр")
                .addMushroom("белый гриб")
                .addTomato("помидорчик")
                .build();

        System.out.println(staticPizza);

//		2.1 Паттерн Adapter
//		Из интересного: можно реализовать двумя способами.
//		В первом случае мы реализовываем интерфейс одного объекта, а второй обёртываем.
//		Во-втором используем множественное наследование
        LegacyPrinter legacyPrinter = new LegacyPrinter();
        ModernPrinter modernPrinter = new PrinterAdapter(legacyPrinter);
        modernPrinter.printDocument("TEST!");

//		2.2 Паттерн Decorator
//		Из интересного: в данном случае используем конкретную реализацию (Coffee), но могли бы и пользоваться интерфейсом Drink, дало бы больше гибкости (мне так кажется с: )
        Coffee coffee = new Coffee(200);
        Coffee coffeeWithSugar = new CoffeeWithSugarDecorator(coffee);
        Coffee coffeeWithAll = new CoffeeWithMilkDecorator(coffeeWithSugar);

        System.out.println(coffee.getCost());
        System.out.println(coffeeWithSugar.getCost());
        System.out.println(coffeeWithAll.getCost());

//	    2.3. Паттерн Composite
        Item root = new Folder();
        Item file = new File();
        Item folder = new Folder();
        Item folder1 = new Folder();

        folder1.addItem(file);
        folder1.addItem(file);
        folder1.addItem(file);
        folder.addItem(folder1);
        folder.addItem(file);
        folder.addItem(file);
        root.addItem(folder);
        root.addItem(file);

        System.out.println(root.getSize());

//      2.4 Паттерн Proxy
        com.example.patterns.proxy.File image = new Image();
        com.example.patterns.proxy.File imageProxy = new ImageProxy();

        BufferedImage bf = image.readFile();
        BufferedImage bf1 = image.readFile();
        BufferedImage bfProxy = imageProxy.readFile();
        BufferedImage bfProxy1 = imageProxy.readFile();

        System.out.println(bf == bf1);
        System.out.println(bfProxy == bfProxy1);

        imageProxy.clearCash();
        BufferedImage bfProxy2 = imageProxy.readFile();
        System.out.println(bfProxy == bfProxy2);

//      3.1 Паттерн Observer
        Channel ch1 = new NewsChannel();
        Channel ch2 = new NewsChannel();
        Agency agency = new NewsAgency();
        agency.addChannel(ch1);
        agency.addChannel(ch2);
        agency.updateChannels("Новое новостное агентство!");
        agency.removeChannel(ch1);
        agency.updateChannels("Теперь эксклюзивно для одного канала!");

//      3.2 Паттерн Strategy
        PaymentProcessor processor = new PaymentProcessor(new CryptoPayment());
        processor.pay();
        processor.setPayment(new PayPalPayment());
        processor.pay();
        processor.setPayment(new CreditCardPayment());
        processor.pay();

//      3.3 Паттерн Command
        TextRedactor textRedactor = new TextRedactor();
        Command pasteCommand = new PasteCommand(textRedactor);
        Command copyCommand = new CopyCommand(textRedactor);
        Command undoCommand = new UndoCommand(textRedactor);

        copyCommand.execute();
        pasteCommand.execute();
        undoCommand.execute();

//      3.4 Паттерн State
        OrderProcessor orderProcessor = new OrderProcessor(new NewOrder());
        orderProcessor.printOrderStatus();
        orderProcessor.getNextOrderStatus();
        orderProcessor.printOrderStatus();
        orderProcessor.getNextOrderStatus();
        orderProcessor.printOrderStatus();
        orderProcessor.getPreviousOrderStatus();
        orderProcessor.printOrderStatus();

//      3.5 Паттерн TemplateMethod
        DrinkCreator drinkCreator = new CoffeeCreator();
        drinkCreator.create();
        drinkCreator = new TeaCreator();
        drinkCreator.create();

//      4.1 Паттерн "Chain of Responsibility"
//      В целом можно nextHandler заполнять руками, а не в конструкторе, чтобы выстроить цепочку самостоятельно
//      Но в данном примере логичнее задать её строго
        Handler lHandler = new LoggingHandler();
        Handler authorizationHandler = new AuthorizationHandler();
        Handler authenticationHandler = new AuthenticationHandler();
        System.out.println("-----------------------------------");
        lHandler.handle();
        System.out.println("-----------------------------------");
        authorizationHandler.handle();
        System.out.println("-----------------------------------");
        authenticationHandler.handle();
//      Для примера вручную изменим последовательность
        System.out.println("-----------------------------------");
        authenticationHandler.setNextHandler(authorizationHandler);
        authorizationHandler.setNextHandler(lHandler);
        lHandler.setNextHandler(null);
        authenticationHandler.handle();

//      4.2 Паттерн Visitor
        System.out.println("-----------------------------------");
        ShoppingCart shoppingCart = new ShoppingCart();
        ProductCostVisitor visitor = new RubbleProductCostVisitor();
        System.out.println(shoppingCart.getCost(visitor));
        System.out.println("-----------------------------------");
        shoppingCart.addProduct(new Book());
        System.out.println(shoppingCart.getCost(visitor));

    }


}
