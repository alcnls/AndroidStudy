# activity

액티비티는 사용자에게 화면을 제공함.
앱에는 보통 여러개의 액티비티 가 있는데 반드시 하나의 메인 액티비티 를 가진다.
main activity는 앱을 처음 실행 했을 때 보여지는 화면이다.
안드로이드의 기능(자바 코드)들과 레이아웃(뷰) 들을 이어주는 역할이 액티비티이다.

한 액티비티가 새로운 액티비티의 시작으로 인해 중단된 경우, 이 상태 변경은 수명주기 콜백 메서드를 통해 알려진다.

액티비티 생명주기

![asd](http://cfile1.uf.tistory.com/image/267F5D4C52E5EEC6325F50)

onCreate()
Activity가 처음 만들어질 때 호출되는 메소드 이면서, 어플리케이션이 처음 시작할 때 최초로 한번 실행되는 메소드 이다. 주로 view를 만들거나 view resource bind , data to list 등을 onCreate()에서 담당하며, 이전 상태의 정보를 담고있는 Bundle을 제공한다.

onStart()
Activity가 다시 시작되기 전에 호출, Actvitiy가 멈춘 후 호출되는 함수, Activity가 사용자에게 보여지기 직전에 호출되는 함수.

onResume()
Activity가 비로소 화면에 보여지는 단계, 사용자에게 Focus를 잡은 상태.

onRestart()
Activity가 멈춰있다가 다시 호출될 때 불리는 함수, 즉 Stopped상태였을 때 다시 호출되어 시작될 때 불린다.

---------- 다른 Activity가 호출 되는 경우 ----------

onPause()
Activity위에 다른 Activity가 올라와서 focus를 잃었을 때 호출되는 함수.
완전 Activity가 가려지지 않은 상태에서 호출되는 함수.
즉 일부분이 보이거나 투명상태일 경우 호출된다.
다른 Activity가 호출되기 전에 실행되기 때문에 onPause()함수에서 시간이 많이 소요되는 작업이나, 많은 일을 처리하면, 다른 Activity가 호출되는 시간이 지연되기 때문에 많은 일을 처리하 않도록 주의한다. 영구적인 data는 여기서 저장한다.

onStop()
Activity위에 다른 Activity가 완전히 올라와 화면에서 100% 가려질 때 호출되는 함수.
홈키를 누르는 경우, 또는 다른 액티비티페이지 이동이 있는 경우.
만약 이상태에서 Activity가 다시 불려지면, onRestart()함수가 호출된다.

onDestroy()
Activity가 완전히 스택에서 없어질 때 호출되는 함수, 즉 제거되는 경우.
finish() 메소드가 호출되거나, 시스템 메모리 확보를 위해 호출된다.
