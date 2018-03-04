package edu.xjtu.cdl2bpel.lpwcommon.util;

public class Queue<E> {   
	  
    private Object[] queueArray;   
    private int head = 0;   
    private int tail = -1;   
    private int elementsCount = 0;   
       
    public Queue(int size){   
        queueArray = new Object[size];   
    }   
  
    @SuppressWarnings("unchecked")   
    public E peek(){   
        if(isEmpty())   
            throw new IllegalStateException("Queue is empty");   
        return (E)queueArray[head];   
    }   
       
    public void insert(E value){   
        if(isFull())   
            throw new IllegalStateException("Queue is full");   
        if(tail == queueArray.length - 1){   
            tail = 0;   
            queueArray[tail] = value;   
        }else{   
            queueArray[++tail] = value;   
        }   
        elementsCount++;   
    }   
       
    public E remove(){   
        E value = peek();   
        if(head == queueArray.length - 1){   
            head = 0;   
        }else{   
            head++;   
        }   
        elementsCount--;   
        return value;   
    }   
       
    public boolean isEmpty(){   
        return elementsCount == 0;   
    }   
       
    public boolean isFull(){   
        return elementsCount == queueArray.length;   
    }   
}  
