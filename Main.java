import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("AI Chatbot");

        JTextArea chatArea = new JTextArea();

        JTextField textField = new JTextField();

        JButton sendButton = new JButton("Send");

        frame.setLayout(new BorderLayout());

        frame.add(chatArea, BorderLayout.CENTER);

        JPanel panel = new JPanel();

        panel.setLayout(new BorderLayout());

        panel.add(textField, BorderLayout.CENTER);

        panel.add(sendButton, BorderLayout.EAST);

        frame.add(panel, BorderLayout.SOUTH);

        sendButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String userText = textField.getText().toLowerCase();

                chatArea.append("You: " + userText + "\n");

                String botReply;

                if(userText.contains("hello") || userText.contains("hi"))
                {
                    botReply = "Hello! How can I help you?";
                }

                else if(userText.contains("ai"))
                {
                    botReply = "AI means Artificial Intelligence.";
                }

                else if(userText.contains("java"))
                {
                    botReply = "Java is a programming language.";
                }

                else if(userText.contains("python"))
                {
                    botReply = "Python is easy to learn.";
                }

                else if(userText.contains("chatbot"))
                {
                    botReply = "Chatbot is a software application that talks with users.";
                }

                else if(userText.contains("help"))
                {
                    botReply = "Yes! I am here to help you.";
                }

                else if(userText.contains("cse"))
                {
                    botReply = "CSE means Computer Science Engineering.";
                }

                else if(userText.contains("html"))
                {
                    botReply = "HTML is used to create web pages.";
                }

                else if(userText.contains("bye"))
                {
                    botReply = "Goodbye! Have a nice day.";
                }

                else
                {
                    botReply = "Sorry, I do not understand your question.";
                }

                chatArea.append("Bot: " + botReply + "\n\n");

                textField.setText("");
            }
        });

        frame.setSize(400, 500);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }
}