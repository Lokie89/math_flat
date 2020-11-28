### 구조
    프로젝트는 spring boot, mybatis, mysql 을 사용하여 만들었으며,
    getter, setter 를 위한 lombok 라이브러리를 사용하였다.
    
    코드 구조는 controller, service, dto 로 크게 나누었다.
    controller 패키지에서는 해당 url 및 사용해야 하는 service(로직) 을 실행 하였고,
    service 는 dao, mapper 를 통하여 DB 에서 가져온 데이터를 
    해당하는 dto 의 클래스를 사용하여 controller 에 전달하여 응답하였다.
    
    AOP 를 통하여 controller 패키지에 Log 를 출력하는 기능을 만들었고,
    예외 처리를 위한 ExceptionHandler 에 HttpStatus 를 포함시켰다.
    NoLog 어노테이션은 로그 출력을 제외하고 싶은 메서드나 타입에 추가할 수 있다. 
    
    학생(student), 과목(subject), 성적(grade) 는 
    모두 Http method 를 통하여 restful 하게 url 을 작성하였고,
    해당 평균을 구하는 두 요구사항은 GradePointAverage 의 약자인 gpa 를 써서 작성하였다.
    
    평균을 구하는 요구사항들은 모두 공통적으로 Collections 의 평균을 구하는 메서드를 가지고 있어야 하므로
    average 메서드를 포함하는 Statistics 인터페이스를 작성하고 구현하는 GPA abstract 클래스로 뼈대를 만들었다.
    GPA abstract 클래스는 각 기능에 응답하기 위한 StudentGPA 와 SubjectGPA 로 상속하여 사용했다.
    
    예외는 RuntimeException 을 상속하며, HttpStatus 를 가진 ContainHttpStatusException abstract 클래스를 만들고
    그 아래 해당 기능들의 예외 사항을 보여줄 메세지와, status 를 포함한 예외 클래스를 만들었다.
    
### 실행방법
    MathflatApplication 실행. 
    또는 command or terminal -> java -jar mathflat-0.0.1-SNAPSHOT.jar
    