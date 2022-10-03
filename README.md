# get-in-line
#### Fastcampus 코로나 줄서기 서비스(한 번에 끝내는 Spring 완.전.판 초격차 패키지 Online)   
  
### 01. 어노테이션 기반 설계 - @Controller, @RestController (20220921)    
  
-Todo  
(1) thymeleaf dependency: 수월한 뷰 개발을 위해 추가  
(2) 5가지 뷰 컨트롤러 작성  
(3) @RestController를 이용한 api 작성  
(4) 뷰 파일 mock 작성  
(5) ErrorController 상속받아 에러 페이지 권한 주도  

### 02. 요청, 응답 설계 - Handler Methods (20220922)  
1) 핸들러 메소드란?  
Spring Web에서 사용자의 요청을 받아 응답을 리턴하는 메소드, (1) 매핑정보 (2) 요청 (3) 응답으로 이루어짐.  
2) 핸들러 메소드가 받을 수 있는 요청들  
: ServletRequest, ServletResponse, HttpSession, WebRequest, @RequestParam, @PathVariable, @RequestBody, @ModelAttribute, @SessionAttribute 등등 많음.  
3) 핸들러 메소드가 리턴할 수 있는 타입들  
: ModelAndView, String/View, @ModelAttribute, Map, Model, @ResponseBody, HttpHeaders 등등  

-Todo  
(1) domain 패키지 생성, 도메인 설계  
(2) constant 패키지 생성, 상수 지정  
(3) @RequestParam 생략 가능(required = false가 기본값)  
(4) 뷰 파일에서 thymeleaf 문법 사용해 데이터를 받아 출력  

### 03. ControllerAdvice  
-기본 에러 응답 응용  
1) BasicErrorController  
스프링 부트의 기본 응답을 이용하고 싶다면 BasicErrorController를 상속 받아 응용  
+BasicErrorController의 핸들러 메소드: BasicErrorController.errorHtml() -> 뷰 응답, BasicErrorController.error() -> json body 응답  
  
2) 커스텀 에러 페이지: 기본  
static.html 이나 templates 파일을 추가해 커스텀 페이지 등록  

-더 자세히 커스터마이징할 수 있는 방법  
1) @ExceptionHandler  
비즈니스 로직이 던진 예외에 반응하는 핸들러 메소드(예외에 특화)  
위치: 특정 컨트롤러 클래스 내부 or @ControllerAdvice 컴포넌트 내부  
특정 예외에 반응  
예외 처리 범위: 컨트롤러 안에 작성 -> 해당 컨트롤러만, @ControllerAdvice에 작성 -> 프로젝트 전체  

+ @ControllerAdvice가 나오기 전에는 특정 컨트롤러 클래스 안에서 사용되어서 영향권이 특정 컨트롤러 안에서만 적용된다는 단점이 있었음. -> 글로벌하게 적용하고 싶다 -> @ControllerAdvice  

2) @ControllerAdvice  
@ExceptionHandler만 모아서 사용하기 위한 어노테이션  
종류: (1) @ControllerAdvice -> 뷰, (2) @RestControllerAdvice = @ControllerAdvice + @ResponseBody -> Web API service  

3) ResponseEntityExceptionHandler  
Spring MVC에서 내부적으로 발생하는 예외들을 처리하는 클래스  
API 예외 처리를 담당하는 @ControllerAdvice 클래스에서 상속 받아 사용  
