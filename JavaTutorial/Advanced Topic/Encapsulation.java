import java.util.*;

class Encapsulation {
    // encapsulation
    // the better your objects protect themselves against misuse, the more useful they are
    class Gremlin {
        // access control/ access modifier
        // objects variables
        int minimumAge = 50; // (default) only can be used within the class itself (local variable)
        public int guid = 20; // (public) possible to modify the variable from another program
        protected String creator = "Chris Columbus"; // (protected) use only in the same class as the variable, also if inherits the class
        private int maximumAge = 240; // (private) you can use it only in the same class.

        // getter and setter method
        // muting method
        // enable the variable to change the value from other objects even if its private
        public void setMaximumAge(int newValue) {
            if (newValue > 0) {
                maximumAge = newValue;
            }
        }

        // accessor method
        // enable the variable to be accessed from other objects even if its private
        public int getMaximumAge() {
            return maximumAge;
        }
}
