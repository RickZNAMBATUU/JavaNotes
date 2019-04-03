// draft
// how to use user-defined annotation

class Annotations {
    // @Annotation
    // bult-in annotation
    @Override // if you want to override method from the superclass
    @SuppressWarnings // if you don't want to show some errors in your codes
    @Deprecated // if you don't want to use that method anymore
    @FunctionalInterface // only inside the Interface, to make your interfaces only have one method

    // to create your own annotations
    // Marker Annotation
    // annotations that don't have a fields/variable, just to comment the line of code

    // Single Value Annotation
    // if annotation has only one field

    // Multi Value Annotation
    // if annotation has many fields

    // Meta Annotation
    @Inherited
    @Documented
    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    @interface SmartPhone {
        String os() default "IOS"; // use default if you don't initialize a value
        int version();
    }

    @SmartPhone(os="Android", version=6)
    class NokiaASeries {
     String model;
     int screenSize;

     public void NokiaASeries(String model, int screenSize) {
         this.model = model;
         this.screenSize = screenSize;
     }
    }
}
