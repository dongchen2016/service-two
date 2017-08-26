package com.mdd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;


/**
 * Created by madongdong on 2017/8/22.
 */
public class Server {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            //创建一个ServerSocket监听8081端口
            ServerSocket serverSocket = new ServerSocket(8082);
            //等待请求
            Socket socket = serverSocket.accept();
            //接受请求后使用Socket进行通信，创建BufferedReader用于读取数据
            BufferedReader is = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String line = is.readLine();
            System.out.println("received frome client:" + line);
            //创建PrintWriter，用于发送数据
            PrintWriter pw = new PrintWriter(socket.getOutputStream());
            pw.println("this data is from server");
            pw.flush();
            //关闭资源
            pw.close();
            is.close();
            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
