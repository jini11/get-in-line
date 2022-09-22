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
