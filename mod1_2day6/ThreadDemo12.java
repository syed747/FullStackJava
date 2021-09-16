package mod1_2day6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo12 {
	public static void main(String[] args) {
		Gun bofors=new Gun();
		ExecutorService es=Executors.newFixedThreadPool(2);
		es.execute(new OperateGunJob(bofors,"ram"));
		es.execute(new OperateGunJob(bofors,"rahim"));
		es.shutdown();
	}
}
class OperateGunJob implements Runnable{
	Gun gun;String name;
	public OperateGunJob(Gun gun,String name) {
		this.gun=gun;this.name=name;
	}
	@Override
	public void run() {
		Thread.currentThread().setName(name);
		for(int i=0;i<5;i++) {
			if(name.equals("ram")) {
				gun.fill();
			}
			else {
				gun.shoot();
			}
		}
	}
}
class Gun{
	boolean gunLoadedFlag;
	synchronized public void fill() {
		if(gunLoadedFlag) {
			try {wait();}catch(Exception e) {}
		}
			String name=Thread.currentThread().getName();
			System.out.println("Filling the gun.....:"+name);
			gunLoadedFlag=true;
			notify();
	}
	
	synchronized public void shoot() {
		//System.out.println("shoot method called..."+gunLoadedFlag);
		if(!gunLoadedFlag) {
			try {wait();}catch(Exception e) {}
		}
			String name=Thread.currentThread().getName();
			System.out.println("shooting the gun.....:"+name);
			gunLoadedFlag=false;
			notify();
		}
	}