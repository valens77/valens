package com.valens.msgqueue;

import java.util.Vector;

public class MsgQueue {

	private Vector queue = null;

	public MsgQueue() {

		queue = new Vector();

	}

	public void send(Object o)

	{
		synchronized (queue) {

			queue.addElement(o);
		}

	}

	public Object recv()

	{
		synchronized (queue) {
			
			if (queue.size() == 0)

				return null;

			Object o = queue.firstElement();

			queue.removeElementAt(0);// or queue[0] = null can also work

			return o;
		}

	}

	public static void main(String s[]) {
		MsgQueue mq = new MsgQueue();
		mq.queue.add("1");
		mq.queue.add("2");
		mq.queue.add("3");
		mq.queue.add("4");
		mq.queue.add("5");
		MsgThread t = new MsgThread(mq);
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		Thread t4 = new Thread(t);
		Thread t5 = new Thread(t);
		Thread t6 = new Thread(t);
		Thread t7 = new Thread(t);
		Thread t8 = new Thread(t);
		t5.start();
		t4.start();
		mq.send("6");
		t3.start();
		mq.send("7");
		t2.start();
		mq.send("8");
		t1.start();
		t6.start();
		t7.start();
		t8.start();
	}
}

class MsgThread implements Runnable {
	private MsgQueue msgQ;

	public MsgThread(MsgQueue msgQ) {

		this.msgQ = msgQ;
	}

	public void run() {

		System.out.println(System.currentTimeMillis() + ":" + msgQ.recv());
	}
}