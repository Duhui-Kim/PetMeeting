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
| IoT               | C++                        |
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
<내가 담당한 업무>
<br>
- Backend : 카카오페이 결제, SSE, JWT 구현, Redis 적용, <br />   CRUD (회원, 보호소, 관리자, 입양후기게시글, 입양후기게시글댓글, 게시글 좋아요 및 취소, 후원, IoT, 입양신청, 결제내역) <br /><br />- Frontend : 입양후기 게시판 페이지, SSE 적용, 보호소 후원랭킹 페이지,  <br /><br />- 설계 : ERD 설계 및 최종 마무리, API 명세 작성, 목업 작성 ([Figma](https://www.figma.com/file/CJ9HEZLxjZVNNuVOknD77B/Untitled?type=design&node-id=0-1&mode=design&t=toRhlsrwhOhdLvyw-0))

<br>

## 2. 프로젝트 결과 

#### 	1) 

<br>

#### 2)

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

<느낀점>

1. 




<아쉬운 점>

1. 웹IoT 프로젝트였는데, 웹의 볼륨이 웹기술이나 웹디자인 팀만큼 컸다. Test와 Clean Code 작성, 최적화를 하고 싶었는데, Frontend 부분이 시간 내에 완성되기 힘들다고 판단되어서 Frontend 부분을 진행했다.
2. 처음 DB 설계를 할 때는 최대한 정규화된 Entity를 만들려고 노력했다. 이후에 카카오페이 결제를 이용한 충전 및 후원을 이용한 소비 내역을 Database에 저장하고, 사용자가 자신의 남은 포인트를 요구하면 Database에서 (충전한 값 - 후원한 값) 을 계산해서 보내줘야 했다. 서비스의 크기가 작고 Dummy Data의 크기도 작아서 문제는 없었지만, 서비스의 크기가 더 커지고, 사용자가 많이 이용하게 된다면 DB Lock 문제도 생길 수 있을 것 같았다. 계산된 Point를 저장하는 테이블을 따로 만들고 충전 및 후원 시마다 업데이트하게 한다면 조회 시에는 빠르게 조회가 가능할 것이라고 생각했지만, 시간 상 테이블을 추가하지는 못했다.
3. 

