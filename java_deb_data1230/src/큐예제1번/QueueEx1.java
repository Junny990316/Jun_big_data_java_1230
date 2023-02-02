package 큐예제1번;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// Queue : FIFO(First in First out) 구조, LinkedList구조를 사용하고 있으며, LinedList 시능 중 큐 관련 기능으로 제한 됨
// add(e) : 맨 뒤에 요소를 삽입 (중간삽입 안됨) - 예외 발생
// offer(e) : 맨 뒤에 요소를 삽입 - true/false 반환
// remove() : 맨 앞의 요소를 제거 - 예외 발생
// poll() : 맨 앞의 요소 제거 - 비어 있으면 null
// element() : 맨 앞의 요소 읽어 옴 - 예외 발생
// peek() : 맨 앞의 요소를 읽어 옴 - Queue가 비어 있으면 null
public class QueueEx1 {
    public static void main(String[] args) {
        Queue<Message> msgQ = new LinkedList<>();
        msgQ.offer(new Message("Mail", "junny"));
        msgQ.add(new Message("SMS", "jun"));
        msgQ.offer(new Message("Kakao", "suzuka"));
        while (!msgQ.isEmpty()) {
            Message msg = msgQ.poll(); // Queue에서 한개의 메시지를 꺼냄(맨 앞)
            switch (msg.command) {
                case "Mail":
                    System.out.println(msg.to + "에게 메일을 보냅니다.");
                    break;
                case "SMS":
                    System.out.println(msg.to + "에게 문자를 보냅니다.");
                    break;
                case "Kakao":
                    System.out.println(msg.to + "에게 카카오톡을 보냅니다.");
                    break;
            }
        }
    }
}
class Message {
    String command;
    String to;

    public Message(String command, String to) {
        this.command = command;
        this.to = to;
    }
}
