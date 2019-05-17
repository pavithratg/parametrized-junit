package com.eviac.blog.powermock.env;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(FooServiceImpl.class)
public class FooServiceImpTest {

	@InjectMocks
	private FooServiceImpl service;

	/**
	 * setup method.
	 */
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		PowerMockito.mockStatic(System.class);
		when(System.getenv("FOO_VAR_1")).thenReturn("test-foo-var-1");

	}

	/**
	 * test.
	 */
	@Test
	public void testSomeFooStuff() {
		// Test
		String res = service.doSomeFooStuff();
		assertTrue(res.equals("test-foo-var-1"));
		PowerMockito.verifyStatic(System.class);
	}
}
