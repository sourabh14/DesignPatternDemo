package com.example.DesignPatternDemo.StructuralPattern.AdapterPattern;

public class AdapterDemo {

    /* Adapter is a special object that converts the interface of one object
        so that another object can understand it. Adapter lets classes work together that
        couldn’t otherwise because of incompatible interfaces.

        The Adapter pattern lets you create a middle-layer class that serves as a translator between
        your code and a legacy class, a 3rd-party class or any other class with a weird interface.

        Eg: hdmi to usb adapter

        The Adapter Pattern is also known as Wrapper.

        Application:
        1. Use the Adapter class when you want to use some existing class, but
            its interface isn’t compatible with the rest of your code.
        2. Use the pattern when you want to reuse several existing sub-classes
            that lack some common functionality that can’t be added to the superclass.
            You could extend each subclass and put the missing function- ality into new child classes.
            However, you’ll need to duplicate the code across all of these new classes, which smells
            really bad. The much more elegant solution would be to put the miss- ing functionality
            into an adapter class.

     */

    public void execute() {

        System.out.println("\n--Adapter pattern demo--");

        IWebDriver webDriverChrome = new ChromeDriver();
        webDriverChrome.getElement();
        webDriverChrome.selectElement();

        IWebDriver webDriverFirefox = new WebDriverAdapter(new FirefoxDriver());
        webDriverFirefox.getElement();
        webDriverFirefox.selectElement();
    }

}
