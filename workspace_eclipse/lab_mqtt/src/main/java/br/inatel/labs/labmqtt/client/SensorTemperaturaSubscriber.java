package br.inatel.labs.labmqtt.client;

import java.util.UUID;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;

/*
 * @autor dimitri.leone
 * @since 03.06.2023
 */

public class SensorTemperaturaSubscriber {

	public static void main(String[] args) throws MqttException {
		
		//1. Cria o subscriber
		String subscriberId = UUID.randomUUID().toString();
		MqttClient subscriber = new MqttClient(MyConstants.URI_BROKER, subscriberId);
		
		
		//2. Conecta
		MqttConnectOptions options = new MqttConnectOptions();
		options.setAutomaticReconnect(true);
		options.setCleanSession(true);
		options.setConnectionTimeout(10);
		subscriber.connect(options);
		
		//3. Recebe a mensagem
		subscriber.subscribe(MyConstants.TOPIC_1, (topic, msg) -> {
			byte[] payload = msg.getPayload();
			System.out.println("Payload recebido: " + new String (payload));
			System.out.println("Tópico recebido: " + topic);
			
			}
		);
		
		
	}
}
