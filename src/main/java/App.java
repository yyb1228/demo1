import lombok.Builder;
import lombok.Data;

import java.nio.file.FileStore;

public class App {

    public static  void main(String[] args){
        System.out.println("Hello World!");

        Student s = Student.builder().name("杨耀波").age(22).build();

        System.out.println(s);
    }

    @Data
    @Builder
    static class Student{
        String name;
        int age;
    }
}
