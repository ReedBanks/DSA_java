import java.util.NoSuchElementException;

public class SizedList <Thing> {
  private Thing[] data;
  public static final int capacity=4;
  private int size=0;

  //default capacity
  public SizedList(){
    this(capacity);
  }
  //user-set capacity
  public SizedList(int value){
    data=(Thing[]) new Object[value];
  }
  //checking if index is within arr
  public void checkIndex(int i,int n){
    if(i<0||i>n){
      throw new IndexOutOfBoundsException("Illegal Index : "+i);
    }
  }

  //adding elements with index
  public void add(int i,Thing e){
    checkIndex(i,size+1);
    if(size==data.length){
      throw new IllegalStateException(("List is full"));
    }
    for (int j=size-1;j>=i;j--){
      data[j+1]=data[j];
    }
    data[i]=e;
    size++;
  }
  //add without index
  public void add(Thing e){
    int i =size;
    add(i,e);
  }
  //add largest index
  //check size b4 insertion and if greater than size you insert it to last

  public void checkIndex2(int i,int n,int l){
    if((i<0 ||i>n) && i>l){
      return;
    }
    else {
      throw new RuntimeException("List is full");
    }
  }
  public void addWithoutError(int i ,Thing e){
    checkIndex2(i,size, data.length);
    if(i>size){
      add(e);
    }
    else{
      add(e);
    }
  }
  public Thing remove (int i){
    checkIndex(i,size);
    Thing temp=data[i];

    for (int j = i; j <size-1 ; j++) {
        data[j]=data[j+1];
    }
    data[size-1]=null;
    size--;
    return temp;
  }
  public int size(){
    return size;
  }
  public boolean isEmpty(){
    return size==0;
  }

//  get value at index
  public Thing get(int i)throws IndexOutOfBoundsException{
    checkIndex(i,size);
  return data[i];}

//  replace value at index
public  Thing set  (int i,Thing e)throws IndexOutOfBoundsException{
    checkIndex(i,size);
    Thing temp=data[i];
    data[i]=e;
    return temp;
}
//check for element
public boolean contains(Object item){
    for(int j=0;j<size-1;j++){
      if(get(j).equals(item)){
        return true;
      };
    }
  return false;
  }

//  display contents
  public void display(){
    if(isEmpty()){
      throw new NoSuchElementException("List is Empty");
    }
    for(int i=0;i<=size;i++){
      System.out.print("|"+i+"|"+get(i)+"| => ");
    }
    System.out.print("null");
  }
//  clear list
  public void clear(){
    if(isEmpty()){
      throw new NoSuchElementException("List is Empty");
    }
    for(int i=0;i<=size;i++){
      set(i,null);
    }
    size=0;
  }

  public static void main(String[] args) {
    SizedList<String> s=new SizedList<>(10);

    s.add("Adam");
    s.add("John");
    s.add("Doe");
    s.add("Mike");
    s.add(1,"Arch");
    s.addWithoutError(9,"mango");


    System.out.println(s.size());
    System.out.println(s.contains("John"));
    System.out.println(s.get(3));
    s.display();
    System.out.println();
    s.clear();
    System.out.println();
    System.out.println("Empty : "+s.isEmpty());
  }
}
