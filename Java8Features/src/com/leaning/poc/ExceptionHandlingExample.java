package com.leaning.poc;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("44", "373", "xyz");
		List<Integer> list1 = Arrays.asList(1, 0);

		// 1. handle Exception for unchecked exception like Arithmetic and NumberFormat
		// Exception
		list1.forEach(handleGenericException(s -> System.out.println(10 / s), ArithmeticException.class));

//		List<Integer> intList = list.stream().map(Integer::parseInt).collect(Collectors.toList());
//		System.out.println(intList);

//		list.forEach(ExceptionHandlingExample::printList);
		list.forEach(handleGenericException(s -> System.out.println(Integer.parseInt(s)), NumberFormatException.class));

		// handle exception for checkedException
		List<Integer> list2 = Arrays.asList(10, 20);
		list2.forEach(handleCheckedExceptionConsumer(i -> {
			Thread.sleep(i);
			System.out.println(i);
		}));

	}

	// approach 2
	private static void printList(String s) {
		try {
			System.out.println(Integer.parseInt(s));

		} catch (Exception e) {
			System.out.println("exception:" + e.getMessage());
		}
	}

	static Consumer<String> handleExceptionIfAny(Consumer<String> payload) {
		return obj -> {
			try {
				payload.accept(obj);
			} catch (Exception e) {
				System.out.println("exception:" + e.getMessage());

			}
		};
	}

	static <Target, ExObj extends Exception> Consumer<Target> handleGenericException(Consumer<Target> targetConsumer,
			Class<ExObj> exObjClass) {
		return obj -> {
			try {
				targetConsumer.accept(obj);
			} catch (Exception e) {
				try {
					ExObj exObj = exObjClass.cast(e);
					System.out.println("exception:" + exObj.getMessage());
				} catch (ClassCastException e1) {
					throw e;
				}

			}
		};
	}

	static <Target> Consumer<Target> handleCheckedExceptionConsumer(
			CheckedExceptionHandlerConsumer<Target, Exception> handlerConsumer) {
		return obj -> {
			try {
				handlerConsumer.accept(obj);
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}
}
