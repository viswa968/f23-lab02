package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.*;

public class Main {
    public static void main(String[] args) {
        Shape myShape = new Rectangle(5, 10); // Can be any shape
        Renderer renderer = new Renderer(myShape);
        renderer.draw();
    }
}
