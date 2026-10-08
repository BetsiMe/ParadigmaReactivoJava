/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.paradigmareactivojava;

   import reactor.core.publisher.Flux;

public class ReactiveExample {
    
    


    public static void main(String[] args) {

        Flux.just("Java", "C#", "Python")
                .filter(s -> s.length() > 3)
                .subscribe(System.out::println);
    }
}

