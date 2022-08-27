package com.example.demo;

import java.time.LocalDate;
//@SpringBootApplication
class DemoApplication {

	public static void main (String[] args){

		Task1 t1 = new Task1("Recordar POO", false, LocalDate.of(2022,8,19));
		Task1 t2 = new Task1("Conocer Intellij IDEA", false, LocalDate.of(2022,8,23));
		Task1 t3 = new Task1("Conocer de Spring Boot", false, LocalDate.of(2022,8,23));
		Task1 t4 = new Task1("Finalizando tareas...", false, LocalDate.of(2022,8,25));
		Task1 t5 = new Task1("Recuperar Finalizando...",false,LocalDate.of(2022,8,20));

	/*
	System.out.println("Desccripcion de la tarea:");
	System.out.println(t1.getDescription());
	System.out.println("Fecha de la tarea:");
	System.out.println(t1.getDueDate());
	System.out.println("Estado de la tarea");
	System.out.println(t1.getDone());

	System.out.println("Tarea modificada");
	t1.setDescription("Modificar POO");
	System.out.println(t1.getDescription());
	 */
		TaskList1 metas = new TaskList1("Tares iniciales");
		metas.addTaskList(t1);
		metas.addTaskList(t2);
		metas.addTaskList(t3);
		metas.addTaskList(t4);
		metas.addTaskList(t5);

		//siout
	/*System.out.println("Tareas iniciales");
	metas.printTask();*/

		metas.removeTask("Recordar POO");
		System.out.println("Tareas Pendientes");
		metas.printTask();
	}

}