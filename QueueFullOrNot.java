public class QueueFullOrNot 
{
    boolean isFull()
    {
        if(front == 0 && rear == MAX_SIZE - 1)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        
    }    
}
