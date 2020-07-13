package com.project.entity.maidService.order;

import java.util.Arrays;
import java.util.List;

public class MaidServiceOrderConstant {
	public final static String OneTimeAdHoc = "OneTimeAdHoc";
	public final static String OnceAFortnight = "OnceAFortnight";
	public final static String OnceAWeek = "OnceAWeek";
	public final static String TwiceAWeek = "TwiceAWeek";

	public final static List<String> planArr = Arrays.asList(OneTimeAdHoc, OnceAFortnight, OnceAWeek, TwiceAWeek);
}
