package com.eviac.blog.powermock.util;

public final class IDGenerator {

	private static int inc;

	public static final int generateID() {
		return inc++;
	}

	public static int getInc() {
		return inc;
	}

}
