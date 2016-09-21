package my.practice.graph;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// http://www.mathcs.emory.edu/~cheung/Courses/323/Syllabus/Graph/bfs.html

public class TestProg
{

   public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
   {
//                        0  1  2  3  4  5  6  7  8
// ===================================================
      int[][] conn = {  { 0, 1, 0, 1, 0, 0, 0, 0, 1 },  // 0
    		  			{ 1, 0, 0, 0, 0, 0, 0, 1, 0 },  // 1
    		  			{ 0, 0, 0, 1, 0, 1, 0, 1, 0 },  // 2
    		  			{ 1, 0, 1, 0, 1, 0, 0, 0, 0 },  // 3
    		  			{ 0, 0, 0, 1, 0, 0, 0, 0, 1 },  // 4
    		  			{ 0, 0, 1, 0, 0, 0, 1, 0, 0 },  // 5
    		  			{ 0, 0, 0, 0, 0, 1, 0, 0, 0 },  // 6
    		  			{ 0, 1, 1, 0, 0, 0, 0, 0, 0 },  // 7
    		  			{ 1, 0, 0, 0, 1, 0, 0, 0, 0 } };// 8


      Graph1 G = new Graph1(conn);

      G.bfs();   
   }
}