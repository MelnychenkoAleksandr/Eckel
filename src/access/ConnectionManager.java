/**4) Following the form of the example Lunch.java, create a class called
 ConnectionManager that manages a fixed array of Connection objects. The client
 programmer must not be able to explicitly create Connection objects, but can only get them
 via a static method in ConnectionManager. When the ConnectionManager runs out of
 objects, it returns a null reference. Test the classes in main( )./



/**
 * Created by alex on 13.07.16.
 */
package access;

import static access.Connection.makeConection;

class Connection{
    private Connection(){
        System.out.println("Connection");
    }
    public static Connection makeConection(){
        return new Connection();
    }
}

public class ConnectionManager {
    public static Connection[] manageConnections(){
        Connection [] array = new Connection[3];
        array[1] = makeConection();
        array[2] = makeConection();
        array[0] = makeConection();

        return array;
    }

    public static void main(String[] args) {
        ConnectionManager conManage = new ConnectionManager();
        conManage.manageConnections();
    }
}
