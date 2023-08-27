# Pet Meeting

- [0. 프로젝트 개요](#0. 프로젝트 개요)
- [1. 팀원 정보 및 업무 분담 내역](#1. 팀원 정보 및 업무 분담 내역)
- [2. UCC](#2. UCC)
- [3. 프로젝트 결과](#3. 프로젝트 결과)
- [4. API 명세서](#4. API 명세서)
- [5. ERD](#5. ERD)
- [6. System Architecture](#6. System Architecture)
- [7. 느낀점 및 아쉬운점](#7. 느낀점 및 아쉬운점)

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

## 1. 팀원 정보 및 업무 분담 내역

| 이름   | 역할              | 설명 |
| ------ | ----------------- | ---- |
| 이재홍 | 팀장, IoT, Infra  |      |
| 김두희 | BackEnd, FrontEnd |      |
|        |                   |      |

<br>

## 2. UCC

<video src=".\exec\PET MEETING 광고.mp4"></video>

<br>

## 3. 프로젝트 결과 

#### 	1) 

<br>

#### 2)

<br>

## 4. API 명세서

![Pet Meeting API 명세](.\exec\Pet Meeting API 명세.png)

<br>

## 5. ERD

![ERD](https://github.com/Duhui-Kim/HPPT_HealthyPacePersonalTrainer/assets/118238663/36e3137a-f54a-4fbe-b3d4-a1558833921f)

<br>

## 6. System Architecture

![System Architecture](https://github.com/Duhui-Kim/HPPT_HealthyPacePersonalTrainer/assets/118238663/fea5500f-eb68-4ae3-be15-d4d484e4e961)

<br>

## 7. 느낀점 및 아쉬운점

<느낀점>

1. 




<아쉬운 점>

1. 웹IoT 프로젝트였는데, 웹의 볼륨이 웹기술이나 웹디자인 팀만큼 컸다. Test와 Clean Code 작성, 최적화를 하고 싶었는데, Frontend 부분이 시간 내에 완성되기 힘들다고 판단되어서 Frontend 부분을 진행했다.
2. 처음 DB 설계를 할 때는 최대한 정규화된 Entity를 만들려고 노력했다. 이후에 카카오페이 결제를 이용한 충전 및 후원을 이용한 소비 내역을 Database에 저장하고, 사용자가 자신의 남은 포인트를 요구하면 Database에서 (충전한 값 - 후원한 값) 을 계산해서 보내줘야 했다. 서비스의 크기가 작고 Dummy Data의 크기도 작아서 문제는 없었지만, 서비스의 크기가 더 커지고, 사용자가 많이 이용하게 된다면 DB Lock 문제도 생길 수 있을 것 같았다. 계산된 Point를 저장하는 테이블을 따로 만들고 충전 및 후원 시마다 업데이트하게 한다면 조회 시에는 빠르게 조회가 가능할 것이라고 생각했지만, 시간 상 테이블을 추가하지는 못했다.
3. 

