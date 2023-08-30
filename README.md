# Pet Meeting

[0. 프로젝트 개요](#0-프로젝트-개요)

[1. 팀원 정보 및 업무 분담 내역](#1-팀원-정보-및-업무-분담-내역)

[2. 프로젝트 결과](#2-프로젝트-결과)

[3. API 명세서](#3-API-명세서)

[4. ERD](#4-ERD)

[5. System Architecture](#5-System-Architecture)

[6. 느낀점 및 아쉬운점](#6-느낀점-및-아쉬운점)



## 0. 프로젝트 개요

- 프로젝트명 : Pet Meeting
- 프로젝트컨셉 : IoT를 이용한 유기견 상호작용 서비스
- 개발기간 : 23.07.04 ~ 23.08.18 (6주)
- 팀원 : 김두희, 김영우, 안희준, 이민웅, 이재홍, 조윤영
- 사용 기술스택

| 분류              | 기술스택                   |
| ----------------- | -------------------------- |
| IoT               | C                          |
| Backend           | SpringBoot, JPA, Java      |
| Frontend          | Node.js, React, JavaScript |
| Database          | MariaDB, Redis             |
| Infra             | Docker, Jenkins, Nginx     |
| 3rd Party Library | OpenVidu                   |

<br>

## 1. 팀원 정보 및 내가 맡은 업무

| 이름   | 역할                                                         |
| ------ | ------------------------------------------------------------ |
| 이재홍 | - 팀장, IoT Leader, OpenVidu (Back), Infra    |
| 안희준 | - Iot, 3D Modeling |
| 김두희 | - Backend Leader, Frontend |
| 조윤영 | - Backend, Frontend, UCC 제작 |
| 이민웅 | - Frontend Leader |
| 김영우 | - Frontend, Infra, 발표 |

<br>

#### <내가 담당한 업무>

- **Backend** : 카카오페이 결제, SSE 적용, Spring Security + JWT를 이용한 인증 및 권한 인가, Docker를 이용한 Redis 구축 및 적용,

  CRUD - JPA, QueryDSL 활용 *(회원, 보호소, 관리자, 입양후기게시글, 입양후기게시글댓글, 게시글 좋아요 및 취소, 후원, IoT, 입양신청, 결제내역)*<br />

- **Frontend** : 입양후기 게시판 페이지, SSE 적용, 보호소 후원랭킹 페이지 (React + MobX)  <br />
- **설계** : ERD 설계 및 최종 마무리, API 명세 작성, 목업 작성 ([Figma](https://www.figma.com/file/CJ9HEZLxjZVNNuVOknD77B/Untitled?type=design&node-id=0-1&mode=design&t=toRhlsrwhOhdLvyw-0))

<br>

## 2. 프로젝트 결과 

#### 	1) 회원가입

 ![회원가입](./기능별GIF/1회원가입.gif)

<br>

#### 2) 포인트 충전

![포인트충전](./기능별GIF/2충전.gif)

<br>

#### 3) 입양후기

![입양후기](./기능별GIF/3입양후기.gif)

<br>

#### 4) 문의게시판

![문의게시판](./기능별GIF/4문의게시판.gif)

<br>

#### 5) 이용방법

![이용방법](./기능별GIF/5이용방법.gif)

<br>

#### 6) 보호소상세

![보호소상세](./기능별GIF/6보호소상세.gif)

<br>

#### 7) 유기견 상세 및 후원

![유기견상세 및 후원](./기능별GIF/7유기견상세및후원.gif)

<br>

#### 8) 마이페이지

![마이페이지](./기능별GIF/8마이페이지.gif)

<br>

#### 9) 입양신청

![입양신청](./기능별GIF/9입양신청.gif)

<br>

#### 10) 로그아웃

![입양신청](./기능별GIF/10로그아웃.gif)

<br>

#### 11) IoT 기기조작

![입양신청](./기능별GIF/11IoT기기조작.gif)

<br>

## 3. API 명세서

![Pet Meeting API 명세](https://github.com/Duhui-Kim/BoardProject/assets/118238663/f809ca29-a9fa-4e74-b144-dd0729786f5d)

<br>

## 4. ERD

![ERD](https://github.com/Duhui-Kim/HPPT_HealthyPacePersonalTrainer/assets/118238663/36e3137a-f54a-4fbe-b3d4-a1558833921f)

<br>

## 5. System Architecture

![System Architecture](https://github.com/Duhui-Kim/HPPT_HealthyPacePersonalTrainer/assets/118238663/fea5500f-eb68-4ae3-be15-d4d484e4e961)

<br>

## 6. 느낀점 및 아쉬운점

**<느낀점>**

1. 익숙한 것들을 많이 했던 프로젝트였다. JPA와 Redis를 사용해보고, 꽤 많은 테이블들을 다루긴 했지만, 아쉬움이 남는다. 그래도 팀원들 모두가 각자 잘하는 부분을 맡아서 진행했기 때문에 좋은 결과는 얻을 수 있었다. 다음 프로젝트에서는 좀 더 낯설고 생소한 부분에 과감히 도전해서 힘들지만 보람있는 프로젝트를 진행해볼 것이다.

<br />

**<아쉬운 점>**

1. **API & Test** : 웹IoT 프로젝트였는데, 웹의 볼륨이 웹기술이나 웹디자인 팀만큼 컸다. Test와 Clean Code 작성, 최적화를 하고 싶었는데, 팀 회의 시 Frontend 부분이 시간 내에 완성되기 힘들다고 판단되어서 Frontend 부분에 추가로 투입되어 진행했다. 다음 프로젝트에서는 예외처리를 제대로 활용해보고 싶고, API Docs를 이용한 문서화, Java 8 이후의 문법에 대해서도 좀 더 익숙해질 필요가 있을 것 같다.
2. **DB** : 처음 DB 설계를 할 때는 최대한 정규화된 Entity를 만들려고 노력했다. 이후에 카카오페이 결제를 이용한 충전 및 후원을 이용한 소비 내역을 Database에 저장하고, 사용자가 자신의 남은 포인트를 요구하면 Database에서 `충전한 값 - 후원한 값` 을 계산해서 보내줘야 했다. 서비스의 크기가 작고 Dummy Data의 크기도 작아서 문제는 없었지만, 서비스의 크기가 더 커지고, 사용자가 많이 이용하게 된다면 DB Lock 문제도 생길 수 있을 것 같았다. 반정규화를 통해 계산된 Point를 저장하는 테이블을 따로 만들고 충전 및 후원 시마다 업데이트하게 한다면 조회 시에는 빠르게 조회가 가능했을 것 같다.
3. **Infra** : Docker와 Ubuntu, Volume 설정은 사용해봤으나, NginX나 Jenkins는 제대로 활용해보지 못했다. 네트워크와 서버에 대해서는 개념적으로 공부하고 있긴 하지만 아직 모르는게 많다고 느낀다. 이번에 Reverse Proxy와 HTTPS에 대해서 알게 되었다.
