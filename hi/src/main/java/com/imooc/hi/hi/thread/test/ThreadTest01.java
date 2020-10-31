package com.imooc.hi.hi.thread.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ThreadTest01 {

	public static void main(String[] args) {
		final List<Object> list = new ArrayList<Object>();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0; i<10; i++)
				{
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(list.size());
					Map<String, String> map = new HashMap<String, String>();
					map.put("s"+i, Thread.currentThread().toString() + i);
					synchronized (list) {						
						list.add(map);
					}
				}
			}
		}).start();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0; i<10; i++)
				{
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(list.size());
					Map<String, String> map = new HashMap<String, String>();
					map.put("s"+i, Thread.currentThread().toString() + i);
					synchronized (list) {						
						list.add(map);
					}
				}
			}
		}).start();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0; i<10; i++)
				{
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(list.size());
					Map<String, String> map = new HashMap<String, String>();
					map.put("s"+i, Thread.currentThread().toString() + i);
					synchronized (list) {						
						list.add(map);
					}
				}
			}
		}).start();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0; i<10; i++)
				{
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(list.size());
					Map<String, String> map = new HashMap<String, String>();
					map.put("s"+i, Thread.currentThread().toString() + i);
					synchronized (list) {						
						list.add(map);
					}
				}
			}
		}).start();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0; i<10; i++)
				{
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(list.size());
					Map<String, String> map = new HashMap<String, String>();
					map.put("s"+i, Thread.currentThread().toString() + i);
					synchronized (list) {						
						list.add(map);
					}
				}
			}
		}).start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("======" + list);
		System.out.println("======" + list.size());
		for(Object obj : list)
		{
			if(null == obj)
			{
				System.out.println("xxxxxxxxxxxxx"+list.indexOf(obj));
			}
		}
	}
}
