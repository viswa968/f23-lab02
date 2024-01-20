import { newRenderer } from "./renderer";
import { newRectangle } from "./shapes/rectangle"; // or other shapes as needed

const shape = newRectangle(2, 3); // Example for rectangle
const renderer = newRenderer(shape);
renderer.draw();
