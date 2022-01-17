package historyOfJava;

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
        public Type type;

        public enum Type {
            person, company, place, language, software, license
        }
    }

    class Event {
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
    static Event OracleAcquisition;
    static Event AndroidCreation;
    static Event MinecraftCreation;

    public static void main(String[] args) { // main is the first method called when running a .java file,
                                             // args stores command line arguments
        // table of contents:

        Intro();
        WhatIsJava();
        Creators();
        Sun();
        Oak();
        JavaFeatures();
        Citations();

    }

    static void Intro() {

    }

    static void WhatIsJava() {
        // "3 billion devices run Java"

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
        JamesGosling.description = "Worked at Sun, Google, Liquid Robotics, AWS, and advised Lightbend on the Scalar"
                + "programming language (which runs on the JVM). Loves sqrt(2), frames the first 1000 digits of it on his wall";
        PatrickNaughton = new Object();
        PatrickNaughton.type = Type.person;
        PatrickNaughton.labels = new String[] { "Java co-creator", "Convicted Pedophile" };
        PatrickNaughton.description = "We don't talk about Patrick Naughton.";
    }

    static void Sun() {
        SunMicrosystems = new Object();
        SunMicrosystems.type = Type.company;
        SunMicrosystems.ownedBy = new Object[] { Oracle };
        SunMicrosystems.isDestroyed = false;

    }

    static void Oak() {

    }

    static void JavaFeatures() {
        boolean C_StyleSyntax = true;
        boolean youCanReadThis;
        boolean youCanReadC = true;
        if (youCanReadC)
            youCanReadThis = true;
        String OPP = "Object Oriented Programming (OOP)";
        Object thisIsAnObject = new Object();
        thisIsAnObject.description = "In OPP languages you can create these!";
        Java.labels = new String[] { Boolean.toString(C_StyleSyntax), OPP, "Write once, run anywhere (WORA)",
                "Just-in-time compilation (JIT)", "Strongly Typed" };

    }

    static void webEra() {

    }

    static void Citations() {

    }

    // some stock algorithms used above

    static <T> boolean contains(T[] array, T element) {
        for (T e : array) {
            if (element.equals(e))
                return true;
        }
        return false;
    }
}
