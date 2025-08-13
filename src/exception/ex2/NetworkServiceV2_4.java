package exception.ex2;

public class NetworkServiceV2_4 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data); //throw new RuntimeException("ex");가 터지면 catch는 런타임 예외랑 상관이 없기 때문에 잡을 수가 없어서 예외 복구가 안되고 런타임 예외이기 때문에 밖으로 던지기 때문에 disconnect()는 호출되지 않는 문제가 발생한다.
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지: " + e.getMessage());
        }

        client.disconnect();
    }
}
