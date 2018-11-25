class AccessModifier {
    public static void main(String[] args) {
        // Encapsulation - hiding the data and their behavior
        // access modifier

        // for class-level
        int classDefault = 4; // no keyword required
        // it is visible only to the classes inside the same package
        // no need to mention import statement, just the same name of the package

        public int classPublic = 1; // visible to all classes, inside and outside the package
        // if it's outside the package, you should mention the import statement
        // if it's inside the same package, there's no need to mention the import statement

        private int classPrivate = 2; // not applicable to the class level declaration
        protected int classProtected = 3; // not applicapbe to the class level declaration

        // for member (methods and instance variable)
        // note: check if the class itself is accessible before use the member with access modifier to other class
        int memberDefault = 5; // no keyword required
        // visible to the classes that are in the same package

        public int memberPublic = 6; // visible to all the classes, inside and outside the package
        // the class in which the member exists should visible to the accessing class (if the class is public)

        private int memberPrivate = 7; // only visible to other member (methods) inside the same class
        // classes inside and outside the package will not be able to access the private members of a class

        protected int memberProtected = 8; // visible to all the class that are in the same package (like default)
        // accessible to classes outside the package, if the accessing class is subclass of the member class (Inheritance)
        // can access by using the keyword 'super' and not by the instance of the object

        // note: local variables are not applicable to use an access modifier
    }
}
