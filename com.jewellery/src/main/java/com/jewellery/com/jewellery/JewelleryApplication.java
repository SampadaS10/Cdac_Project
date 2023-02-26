package com.jewellery.com.jewellery;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.aspectj.weaver.ast.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import com.jewellery.com.jewellery.entity.TestEntity;
import com.jewellery.com.jewellery.repo.TestRepo;


@SpringBootApplication
public class JewelleryApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JewelleryApplication.class, args);
		TestRepo repo=context.getBean(TestRepo.class);
		
//		TestEntity t1=new TestEntity();
//		t1.setName("Sampada");
//		
//		TestEntity t2=new TestEntity();
//		t2.setName("Shri");
//		
//		List<TestEntity> enlst=List.of(t1,t2);
//		Iterable<TestEntity> res=repo.saveAll(enlst);
//		
//		res.forEach(test->{
//			System.out.println(test);
//		});
//		TestEntity test1=repo.save(t);
//		System.out.println(test1);
		
//		Optional<TestEntity> op= repo.findById(303);
//		TestEntity test1=op.get();
//		System.out.println(test1);
//		test1.setName("Shrinidhi");
//		repo.save(test1);
		
		//Iterable<TestEntity> itr= repo.findAll();
//		Iterator<TestEntity> iterator=itr.iterator();
//		while(iterator.hasNext())
//		{
//			TestEntity te=iterator.next();
//			System.out.println(te);
//		}
//		itr.forEach(new Consumer<TestEntity>() {
//
//			@Override
//			public void accept(TestEntity t) {
//				System.out.println(t);
//				
//			}
//		});
		//itr.forEach(t -> {System.out.println(t);});
		
	//repo.deleteById(302);
	
	}

}
