package historyOfJava;

import java.util.concurrent.TimeUnit;

import historyOfJava.Main.Object.Type;

// Main.java is the first file called when running a Java project

/*                                                                              
                       ((                                                                               
                     (((                                                   &&&                          
                  (((       (                                            &&@@@&                         
               (((     ((,                                             &&@@@@@@&&                       
             (((    (((                                              *&@@@@@@@@@&&             @@       
            *((    ((((                                             &&@@@@@@@@@@@&&            @@@      
             ((.    ((((                                          &&@@@@@@@@@@@@@@&&           &@@@@@@  
               (/     (((,                                       &&@@&&,,,*.//&&@@@&&         @@@@@@@@  
                 ,     ((                                       &@@&&*,,,,,*.//(&&@@&&        @@@@@@@   
        *#(           *            ##.                       @@&@@@&*******.//((#&@@@&&     @.          
    ,######(/*.//(#########         ##                 @.     &    &////////(((#&&   @&&@ @             
                                   ##/                @,     &.     &&((((((##&&       &@@              
        *###(,...,/(########    .#(             @@  @@@@    &&                         *&               
                                                  @@@@@@@@*&&                           &&              
          ####/.  .,/#####                     @@@@ @@/  @@&/                           &&              
       ..                                           @@    %&                            &&              
####,                           (##   /                   &&       &&&&#     (&&&,      &               
           ,/((#######((*.       ,###                     &&   &&&                &&   &&               
            ,/############(,                                &%                      ,&*/

@SuppressWarnings("unused")
public class Main {
    static class Object {
        public String created;
        public boolean isDestroyed;
        public String destroyed;
        public Object[] createdBy;
        public Object[] ownedBy;
        public String description;
        public String[] labels;
        public String mood;
        public Type type;

        public enum Type {
            person, company, place, language, software, license
        }
    }

    static class Event {
        public String summary;
        public String startTime;
        public boolean hasEnded;
        public String endTime;
        public String place;
        public Object[] objectsInvolved;
        public Object[] leadTo;
        public Event[] causes;
    }

    // index
    static Object Java;
    static Object SunMicrosystems;
    static Object JamesGosling;
    static Object MikeSheridan;
    static Object PatrickNaughton;
    static Object Oracle;
    static Object GreenTeam;

    static Event JavaCreation;

    public static void main(String[] args) throws InterruptedException { // main is the first method called when running
                                                                         // a .java file,
        // args stores command line arguments
        // table of contents:

        WhatIsJava();
        Creators();
        Sun();
        Creation();
        JavaFeatures();
        WebEra();
        Citations();

    }

    /** 3 billion devices run Java */
    static void WhatIsJava() {
        Java = new Object();
        Java.type = Type.language;
        Java.created = "01/23/1996";
        Java.createdBy = new Object[] { JamesGosling, PatrickNaughton, MikeSheridan, GreenTeam, SunMicrosystems };
        Java.ownedBy = new Object[] { Oracle };
        Java.isDestroyed = false;
    }

    static void Creators() {
        JamesGosling = new Object();
        JamesGosling.type = Type.person;
        JamesGosling.created = "05/19/1955";
        JamesGosling.isDestroyed = false;
        JamesGosling.labels = new String[] { "Dr. Java", "Order of Canada", "National Academy of Engineering (NAE)" };
        JamesGosling.description = "He recieved a Bachelor's degree at the University of Calgary and a Masters & PhD from Carnegie Mellon University"
                + "He worked at Google, Liquid Robotics, AWS, and advised Lightbend on the Scalar programming language"
                + "(which runs on the JVM) after Java. He loves sqrt(2) and framed the first 1000 digits of it on the wall of his office";

        MikeSheridan = new Object();
        MikeSheridan.type = Type.person;
        MikeSheridan.labels = new String[] { "Java co-creator", "BlueChair Group Inc.", "Novell Inc." };
        MikeSheridan.description = "Little is known about him, however he is reported to have gratuated from Claremont College with a degree"
                + "in economics, political science, and Russian history. He also did graduate work on film and video at The American University"
                + "Post-java, he worked with Novell Inc. on the Novell Directory Services (NDS), and is currently staffed at Bluechair Group"
                + "(a startup expertise group)";
        MikeSheridan.isDestroyed = false;

        PatrickNaughton = new Object();
        PatrickNaughton.type = Type.person;
        PatrickNaughton.labels = new String[] { "Java co-creator", "Convicted Child Groomer" };
        PatrickNaughton.description = "We don't talk about Patrick Naughton";
        PatrickNaughton.isDestroyed = true; // false physically, true metaphorically
        PatrickNaughton.destroyed = "09/14/1999"; // why did you do this Patrick
    }

    static void Sun() {
        SunMicrosystems = new Object();
        SunMicrosystems.type = Type.company;
        SunMicrosystems.created = "02/24/1982";
        String founders = "Andreas Bechtolsheim, William Joy, Vinod Khosla, Scott McNealy";
        SunMicrosystems.ownedBy = new Object[] { Oracle }; // currently merged with
        SunMicrosystems.isDestroyed = true;
        SunMicrosystems.destroyed = "01/21/2010";
        SunMicrosystems.labels = new String[] { "Java", "Solaris", "VirtualBox", "SPARC Chipset", "FOSS", "MySQL" };
        SunMicrosystems.description = "Sun Microsystems was an american company which produced software and computer components"
                + "Sun is best known for contributing to the advancement of operating systems (UNIX & Solaris), database technology (MySQL),"
                + "virtual computing (Java & VirtualBox), reduced instruction set computers (SPARC), and the open source movement";
    }

    static void Creation() throws InterruptedException {
        JavaCreation = new Event();
        JavaCreation.startTime = "12/xx/1990";
        String problem = "Sun's C and CPP APIs were in poor quality";
        if (problem != null) {
            JamesGosling.mood = "Frustrated";
        }
        Object JamesGoslingCreates = new Object();
        JamesGoslingCreates.type = Type.language;
        String projectName = "GreenTalk";

        TimeUnit.DAYS.sleep(182); // around 6 months

        GreenTeam = new Object();
        GreenTeam.created = "06/xx/1991";
        GreenTeam.createdBy = new Object[] { JamesGosling, PatrickNaughton, MikeSheridan };
        GreenTeam.labels = new String[] { "electronic Appliances", "embedded systems", "TV remotes" }; // objectives
        projectName = "C++ ++ --"; // yes it was once named this
        if (!"oak tree outside of his office".isEmpty()) {
            projectName = "Oak";
        }

        int year = 1993;
        double appliancePopularity = Double.NEGATIVE_INFINITY;
        double OakAdvanceness = Double.POSITIVE_INFINITY;
        GreenTeam.labels = new String[] { "the web" };
        boolean C_CPP_PlatformDependence = true;
        if (C_CPP_PlatformDependence) {
            if (!System.getProperty("os.name").equals("The devs' OS")) { // if I use an OS different to the developers'
                boolean willItRunC_CPP = false;
                boolean C_CPP_WebReliability = false;
                boolean willItRunOak = true;
            }
        }
        projectName = "Java"; // named after the coffee islands
        JavaCreation.endTime = "01/23/1996";
    }

    static void JavaFeatures() {
        boolean youCanReadC = true;
        if (youCanReadC) {
            boolean youCanReadThis = true;
        }
        boolean C_StyleSyntax = true;

        String OPP = "Object Oriented Programming (OOP)";
        Object thisIsAnObject = new Object();
        thisIsAnObject.description = "In OPP languages you can create these!";

        String JIT = "Just-in-time compilation";
        /*
         * the Java compiler, javac, converts readable code into bytecode, basically
         * platform-independent machine code. The Java Virtual Machine (JVM/JRE) is then
         * needed to interpret that bytecode into platform & CPU instructions. This
         * process is called JIT because despite being slower than native C/C++
         * binaries, bytecode is much faster than interpreted languages like python
         */

        String WORA = "Write once, run anywhere";
        if (Runtime.getRuntime().availableProcessors() > 0 && // checks if you have a cpu
                Runtime.getRuntime().maxMemory() > 0 && // checks if you have memory
                System.getProperty("java.home") != null) { // checks if you have a JVM / JRE
            boolean canItRunJavaByetcode = true;
        }

        String GB = "Garbage Collection";
        Object foo = new Object();
        foo = null; // in C or C++, the memory has to be de-allocated manually
        System.gc(); // in java, this function is run automatically and de-allocates for you;

        String Threads = "Java is one of the first languages to make multithreading easy";
        class bar extends Thread { // threads are needed if you want your code to do multiple things at once
            @Override
            public void run() {
                System.out.println("I'm in a thread!");
            }
        }
        bar Bar = new bar();
        Bar.start(); // this is how easy it is to build a thread in java

        Java.labels = new String[] { Boolean.toString(C_StyleSyntax), OPP, JIT, WORA, GB, Threads };

    }

    static void WebEra() {
        if (GreenTeam.labels[0].equals("the web")) {
            boolean JavaSuccess = true;
        }
        String[] JavaSupportedBrowsers = new String[] { "Netscape", "HotJava" };
        // Java was packaged with Netscape on release
        // HotJava was a browser written by Sun specifically for Java
        // Netscape eventially became Mozilla Firefox

        // however, browser embedded Java (applet) was not without its flaws
        boolean appletSecure = false;
        boolean JRE_BigSize = true;
        boolean JRE_InstallNeedsAdminAccess = true;

        // the go-to browser language gradually transformed to JavaScript
        // which had a similar syntax but completely different design

        Java.description = "A general-purpose, high-level programming language that will run on any machine";
    }

    static void Citations() {

    }

    static <T> boolean contains(T[] array, T element) { // unused
        for (T e : array) {
            if (element.equals(e))
                return true;
        }
        return false;
    }
}
