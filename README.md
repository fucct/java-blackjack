# 블랙잭 미션

## 기능 요구사항

- 블랙잭 게임을 변형한 프로그램을 구현한다. 블랙잭 게임은 딜러와 플레이어 중 카드의 합이 21 또는 21에 가장 가까운 숫자를 가지는 쪽이 이기는 게임이다.
- 플레이어는 게임을 시작할 때 배팅 금액을 정해야 한다. 카드의 숫자 계산은 카드 숫자를 기본으로 하며, 예외로 Ace는 1 또는 11로 계산할 수 있으며, King, Queen, Jack은 각각 10으로 계산한다.
- 게임을 시작하면 플레이어는 두 장의 카드를 지급 받으며, 두 장의 카드 숫자를 합쳐 21을 초과하지 않으면서 21에 가깝게 만들면 이긴다. 21을 넘지 않을 경우 원한다면 얼마든지 카드를 계속 뽑을 수 있다. 단, 카드를 추가로 뽑아 21을 초과할 경우 배팅 금액을 모두 잃게 된다.
- 딜러는 처음에 받은 2장의 합계가 16이하이면 반드시 1장의 카드를 추가로 받아야 하고, 17점 이상이면 추가로 받을 수 없다.
- 게임을 완료한 후 각 플레이어별로 승패를 출력한다.

## 프로그래밍 요구사항

- 딜러와 플레이어에서 발생하는 중복 코드를 제거해야 한다.

## 기능 구현

PlayerNames 클래스

- 입력 검증 구현
  - split / Empty / Null


User 클래스
- draw
- 보유한 카드
- 카드 점수 계산

    - Player 클래스
      - draw(Overriding)
      - 이름
      - result
    - Dealer 클래스
      - draw(Overriding)
      - 이름
      - result

Players 
- Player 일급 컬렉션


Card

- enum
  - 숫자
  - 모양

CardFactory

- 카드 덱 생성

Deck

- 팩토리로 생성된 실제 게임 사용 덱

CardHand

- 일급 컬렉션

YesOrNo

- 카드를 받을 건지 입력 받고 검

Result

- enum
- 최종승패 결과
