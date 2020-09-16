package com.BallGame;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
import javax.swing.*;
public class BallGame extends JFrame {

    Image ball=Toolkit.getDefaultToolkit().getImage("images/ball.png");
    Image desk=Toolkit.getDefaultToolkit().getImage("images/back.png");

    public double x;
    public double y;

    static double v=13.0;
    double degree=3.14/3;//弧度180°除以3 为60°
    double friction=0.95;//摩擦系数


    boolean right=true;//控制水平方向移动



    //绘制窗口
    public void paint(Graphics g) {
        //System.out.println("窗口绘制了一次");
        g.drawImage(desk, 0, 34, null);
        g.drawImage(ball, (int) x, (int) y, null);

        x += v * Math.cos(degree);
        y += v * Math.sin(degree);

        if (y > 420 || y < 66) {
            degree = -degree;
            v*=friction;
        }
        if (x > 783 || x < 33) {
            degree = 3.14 - degree;
            v*=friction;
        }
        if((x>756&&x<783)&&(y>67&&y<90)){
            x=1000;
            y=1000;
            JOptionPane.showMessageDialog(null, "BallGame Vector");
            g=null;
        }
        if((int)v<=1)
            v=0;
    }

    void lanuchFrame(){
        setSize(856,493);
        setLocation(200,170);
        setVisible(true);

        while (true){//绘制窗口每秒25次
            repaint();
            try {
                Thread.sleep(40);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("弹球小游戏");
        BallGame game=new BallGame();
        Scanner s=new Scanner(System.in);
        System.out.println("请输入小球X坐标，需要在41-731之间");
        game.x=s.nextDouble();
        System.out.println("请输入小球Y坐标，需要在101-401之间");
        game.y=s.nextDouble();
        if((game.x > 730 || game.x < 40)||(game.y > 400 || game.y < 100))
            System.out.println("请重新开始");
        else
        game.lanuchFrame();

        if((int)v==0){
            JOptionPane.showMessageDialog(null, "BallGame GameOver");
            game=null;
        }

        game.setTitle("疯狂弹球");


    }

}
