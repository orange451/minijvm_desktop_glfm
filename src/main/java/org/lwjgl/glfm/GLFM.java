package org.lwjgl.glfm;

import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWCharCallbackI;
import org.lwjgl.glfw.GLFWKeyCallbackI;

public class GLFM {
    public static final int //
	    GLFMRenderingAPIOpenGLES2 = 0,
	    GLFMRenderingAPIOpenGLES3 = 1,
	    GLFMRenderingAPIOpenGLES31 = 2,
	    GLFMRenderingAPIOpenGLES32 = 3;
    
	public static final int //
	    GLFMColorFormatRGBA8888 = 0,
	    GLFMColorFormatRGB565 = 1;
	
	public static final int //
	    GLFMDepthFormatNone = 0,
	    GLFMDepthFormat16 = 1,
	    GLFMDepthFormat24 = 2;
	
	public static final int //
	    GLFMStencilFormatNone = 0,
	    GLFMStencilFormat8 = 1;
	
	public static final int //
	    GLFMMultisampleNone = 0,
	    GLFMMultisample4X = 1;
	
	public static final int //
	    GLFMUserInterfaceChromeNavigation = 0,
	    GLFMUserInterfaceChromeNavigationAndStatusBar = 1,
	    GLFMUserInterfaceChromeFullscreen = 2;
	
	public static final int //
	    GLFMUserInterfaceOrientationAny = 0,
	    GLFMUserInterfaceOrientationPortrait = 1,
	    GLFMUserInterfaceOrientationLandscape = 2;
	
	public static final int //
	    GLFMTouchPhaseHover = 0,
	    GLFMTouchPhaseBegan = 1,
	    GLFMTouchPhaseMoved = 2,
	    GLFMTouchPhaseEnded = 3,
	    GLFMTouchPhaseCancelled = 4;
	
	public static final int //
	    GLFMMouseCursorAuto = 0,
	    GLFMMouseCursorNone = 1,
	    GLFMMouseCursorDefault = 2,
	    GLFMMouseCursorPointer = 3,
	    GLFMMouseCursorCrosshair = 4,
	    GLFMMouseCursorText = 5;
	
	public static final int //
	    GLFMKeyBackspace = 0x08,
	    GLFMKeyTab = 0x09,
	    GLFMKeyEnter = 0x0d,
	    GLFMKeyEscape = 0x1b,
	    GLFMKeySpace = 0x20,
	    GLFMKeyLeft = 0x25,
	    GLFMKeyUp = 0x26,
	    GLFMKeyRight = 0x27,
	    GLFMKeyDown = 0x28,
	    GLFMKeyNavBack = 0x1000,
	    GLFMKeyNavMenu = 0x1001,
	    GLFMKeyNavSelect = 0x1002,
	    GLFMKeyPlayPause = 0x2000;
	
	public static final int //
	    GLFMKeyModifierShift = (1 << 0),
	    GLFMKeyModifierCtrl = (1 << 1),
	    GLFMKeyModifierAlt = (1 << 2),
	    GLFMKeyModifierMeta = (1 << 3);
	
	public static int //
	    GLFMKeyActionPressed = 0,
	    GLFMKeyActionRepeated = 1,
	    GLFMKeyActionReleased = 2;
	
	/**
	* photo pick
	*/
	public static int GLFMPickPhotoZoom_MASK = 0;
	public static int GLFMPickPhotoZoom_1024 = 0;
	public static int GLFMPickPhotoZoom_No = 1;
	//
	public static int GLFMPickPhotoSave_MASK = 1;
	public static int GLFMPickPhotoSave_yes = 2;
	public static int GLFMPickPhotoSave_no = 0;
	
	public static int GLFMPickupTypeNoDef = 0;
	public static int GLFMPickupTypeImage = 1;
	public static int GLFMPickupTypeVideo = 2;
	//
	
	public static void glfmSetUserInterfaceOrientation(long display, int allowedOrientations) {
		System.out.println("glfmSetUserInterfaceOrientation not supported by GLFW.");
	}
	
	public static int glfmGetUserInterfaceOrientation(long display) {
		System.out.println("glfmGetUserInterfaceOrientation not supported by GLFW.");
		return 0;
	}
	
	public static void glfmSetMultitouchEnabled(long display, boolean multitouchEnabled) {
		System.out.println("glfmSetMultitouchEnabled not supported by GLFW.");
	}
	
	public static boolean glfmGetMultitouchEnabled(long display) {
		System.out.println("glfmGetMultitouchEnabled not supported by GLFW.");
		return false;
	}
	
	public static int glfmGetDisplayWidth(long display) {
		int[] width = new int[1];
		int[] height = new int[1];
		GLFW.glfwGetWindowSize(display, width, height);
		return width[0];
	}
	
	public static int glfmGetDisplayHeight(long display) {
		int[] width = new int[1];
		int[] height = new int[1];
		GLFW.glfwGetWindowSize(display, width, height);
		return height[0];
	}
	
	public static double glfmGetDisplayScale(long display) {
		int[] width = new int[1];
		int[] height = new int[1];
		GLFW.glfwGetFramebufferSize(display, width, height);
		return width[0] / (double)glfmGetDisplayWidth(display);
	}
	
	public static void glfmGetDisplayChromeInsets(long display, double[] top_right_bottom_left) {
		for (int i = 0; i < top_right_bottom_left.length; i++) {
			top_right_bottom_left[i] = 0;
		}
	}
	
	public static int glfmGetDisplayChrome(long display) {
		System.out.println("glfmGetDisplayChrome not supported by GLFW.");
		return 0;
	}
	
	public static void glfmSetDisplayChrome(long display, int uiChrome) {
		System.out.println("glfmSetDisplayChrome not supported by GLFW.");
	}
	
	public static int glfmGetRenderingAPI(long display) {
		System.out.println("glfmGetRenderingAPI not supported by GLFW.");
		return 0;
	}
	
	public static boolean glfmHasTouch(long display) {
		System.out.println("glfmHasTouch not supported by GLFW.");
		return false;
	}
	
	public static void glfmSetMouseCursor(long display, int mouseCursor) {
		System.out.println("glfmSetMouseCursor not supported by GLFW.");
	}
	
	public static boolean glfmExtensionSupported(String extension) {
		return GLFW.glfwExtensionSupported(extension);
	}
	
	public static void glfmSetKeyboardVisible(long display, boolean visible) {
		System.out.println("glfmSetKeyboardVisible not supported by GLFW.");
	}
	
	public static boolean glfmGetKeyboardVisible(long display) {
		System.out.println("glfmGetKeyboardVisible not supported by GLFW.");
		return false;
	}
	
	public static String glfmGetClipBoardContent() {
		return GLFW.glfwGetClipboardString(GLFW.glfwGetCurrentContext());
	}
	
	public static void glfmSetClipBoardContent(String str) {
		GLFW.glfwSetClipboardString(GLFW.glfwGetCurrentContext(), str);
	}
	
	public static void glfmPickPhotoAlbum(long display, int uid, int type) {
		System.out.println("glfmPickPhotoAlbum not supported by GLFW.");
	}
	
	public static void glfmPickPhotoCamera(long display, int uid, int type) {
		System.out.println("glfmPickPhotoCamera not supported by GLFW.");
	}
	
	public static void glfmImageCrop(long display, int uid, String uris, int x, int y, int width, int height) {
		System.out.println("glfmImageCrop not supported by GLFW.");
	}
	
	public static long glfmPlayVideo(long display, String uris, String mimeType) {
		System.out.println("glfmPlayVideo not supported by GLFW.");
		return 0l;
	}
	
	public static void glfmStartVideo(long display, long handle) {
		System.out.println("glfmStartVideo not supported by GLFW.");
	}
	
	public static void glfmStopVideo(long display, long handle) {
		System.out.println("glfmStopVideo not supported by GLFW.");
	}
	
	public static void glfmPauseVideo(long display, long handle) {
		System.out.println("glfmPauseVideo not supported by GLFW.");
	}
	
    public static void glfmSetDisplayConfig(long display,
            int preferredAPI,
            int colorFormat,
            int depthFormat,
            int stencilFormat,
            int multisample) {
    	//
	}
    
	public static GLFWCharCallbackI glfmSetCharCallback(long window, GLFWCharCallbackI callback) {
		return GLFW.glfwSetCharCallback(window, callback);
	}
	
	public static GLFWKeyCallbackI glfmSetKeyCallback(long window, GLFWKeyCallbackI callback) {
		return GLFW.glfwSetKeyCallback(window, callback);
	}
	
	public static GLFMRenderFuncCallbackI glfmSetRenderFuncCallback(long window, GLFMRenderFuncCallbackI callback) {
		return callback;
	}
}
