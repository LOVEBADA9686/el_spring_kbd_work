package a.b.c.com.common;

public abstract class CommonUtils {
	
	// 이미지 업로드
	public static final String IMG_UPLOAD_PATH = "C:\\00.KOSMO93\\30.Web\\el_spring_kbd_work\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\springKbd\\imgupload";
	//public static final String IMG_UPLOAD_PATH = "C:\\00.KOSMO93\\eclipseSpringWork\\testSpring3\\WebContent\\imgupload";
	public static final int IMG_FILE_SIZE = 2*1024*1024; // 2MB
	public static final String EN_CODE = "UTF-8";
	
	// 파일 업로드
	public static final String FILE_UPLOAD_PATH = "C:\\00.KOSMO93\\30.Web\\el_spring_kbd_work\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\springKbd\\fileupload";
	public static final int FILE_FILE_SIZE = 10*1024*1024; // 10MB
	
	// 게시판 페이징 사이즈 초기화
	public static final int BOARD_PAGE_SIZE = 5;
	public static final int BOARD_GROUP_SIZE = 3;
	public static final int BOARD_CUR_PAGE = 1;
	public static final int BOARD_TOTAL_COUNT = 0;
	
}
