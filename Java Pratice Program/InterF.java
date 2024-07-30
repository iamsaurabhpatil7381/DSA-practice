    interface Engine {

        //only and only abstract method are allowed;
        void start();
        void stop();
        void acc();
    }
    interface Brake {
        void brake();
        
    }
    
    public class  InterF implements Engine,Brake{

        int a=30;
        public void start() {
            System.out.println("this is new start");
        }

    
        public void stop() {
            System.out.println("this is new stop");
        }
    
        public void acc() {
            System.out.println("this is new acc");
        }
        public void brake() {
            System.out.println("this is new brake");
        }
    
        public static void main(String[] args) {
            //Engine car = new InterF();
            InterF car1 = new InterF();
            System.out.println(car1.a);
            //car.a  is not accessible because of the object type
            car1.start();
            car1.stop();
            car1.acc();
            car1.brake();
        }
    }
    

