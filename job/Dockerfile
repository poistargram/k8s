FROM openjdk:11
# openjdk 11 버전이 포함된 OS의 이미지로 시작!

COPY console.jar poi.jar  
# 이미지 실행 후 로컬의 jar 파일을 실행할 서버로 복사해온다

ENTRYPOINT ["java", "-jar", "poi.jar"]
# 서버 구동 후 수행할 명령어

