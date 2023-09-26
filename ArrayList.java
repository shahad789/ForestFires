
package listtest;


public class ArrayList<T> implements List<T>{
    
    //attributes
    private int maxSize;
    private int size;
    private int current;
    private T[] nodes;
    
    //constructor
    public ArrayList(int n){
        size=0;
        current=-1;
        maxSize=n;
        nodes=(T[])new Object[n];   
    }
    
    //methods
    
    //1
    public void findFirst(){
        current=0;
    }
    
    //2
    public void findNext(){
        current++;
    }
    
    //3
    public T retrieve(){
        return nodes[current];
    }
    
    //4
    public void update(T e){
        nodes[current]=e;
    }
    
    //5
    public void insert(T e){
       
        for(int i=size-1;i>current;--i) nodes[i+1]=nodes[i];
        current++;
        nodes[current]=e; 
        size++;
        
        
    }
    
    //6
    public void remove(){
        for(int i=current+1;i<size;i++) nodes[i-1]=nodes[i];
        size--;
        if(size==0) current=-1; 
        else if(current==size) current=0;
    }
    
    //7
    public boolean full(){
        return size==maxSize;
    }
    
    //8
    public boolean empty(){
        return size==0;
    }
    
    //9
    public boolean last(){
        return current==size-1;
    }
    
    //10
    public void insert2(T val){
        for(int i=size-1;i>current;i--)
            nodes[i]=nodes[i-1];
        nodes[++current]=val;
        size++;
    }
    
    //11
    public T remove2(){
        T x = nodes[current];
        for(int i=current;i<size-1;i++)
            nodes[i]=nodes[i+1];
        size--;
        return x;
    }
    
    //11
    public void display(){
        for(int i=0; i<size;i++)
        System.out.print(nodes[i]+"  "); 
    }
    
    public int length(){
        return size;
    }
    
    //12
    public T deleteLast(){
        if(size==0) return null; else{
        T y = nodes[size-1];
        size--;
        return y;}
    }
    
    //13
    public T returnIndex(int i){
        return nodes[i];
    }
    
    //14
    public void insertIndex(int i,T x){
        for(int m=size;m>i;m--)
            nodes[m]=nodes[m-1]; //nafs remove bs index mo3ayan start
        nodes[i++]=x;
        size++;
        
    }
    

    //15
    public void findPrevious(){current--;}
    
    
    
    
    
    
    
    
    
    
           
            
    
    
    
    
    
}//class