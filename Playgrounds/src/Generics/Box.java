package Generics;

public class Box <T>{

    private T content;

    //setter
    public void setContent(T content) {
        this.content = content;
    }

    //getter
    public T getContent() {
        return content;
    }
}


class myMain{


    public static void main(String[] args) {
        //String
        Box <String> stringBox = new Box<>();
        stringBox.setContent("Hello World");
        String content = stringBox.getContent();

        System.out.println("The content is: " + content);

        //Integer
        Box <Integer> integerBox = new Box<>();
        integerBox.setContent(123);
        Integer number = integerBox.getContent();

        System.out.println("The content is: " + number);


    }


}