# ListView


안드로이드에서 가장 많이 사용되는 위젯 중 하나 입니다. 

ListView 처럼 여러 개의 아이템 중에 하나를 선택할 수 있는 위젯들을 '선택위젯'이라고 부른다.

선택위젯: 어댑터(Adapter) 패턴을 사용하므로 직접 위젯의 각 아이템에 이미지나 텍스트를 넣을 수 없을 뿐더러, 어댑터에서 만들어주는 뷰를 이용해 리스트 뷰의 한 아이템을 보여줘야한다. 
사용자가 직접 선택 위젯의 각 아이템에 데이터를 입력하는 것이 아니다. 



## Adapter

ListView에 데이터를 추가하여 화면에 표시하기 위해서는 Adapter를 사용해야 합니다. 

일반적으로 Adapter라는 의미는 “장치또는 기계의 다른 부분을 연결하는 장치로, 적합하지 않은 두 개의 부분을 전지적 또는 기계적으로 접속하기 위한 장치 또는 도구”를 말합니다.

ListView에서 사용하는 Adapter 또한 의미적으로 크게 다르지 않습니다. 

Adapter가 하는 역할은 사용자 데이터를 입력받아 View를 생성하는 것이며 Adapter에서 생성되는 View는 ListView 내 하나의 아이템 영역에 표시되는 것입니다.

*getView()

```
public void getView(int position , View convertView , ViewGroup parent)
```

* int position : 아이템의 인덱스를 의미하는 것으로 리스트뷰에서 보일 아이템의 위치 정보이다. 0부터 시작하여 아이템 개수만큼 파라미터로 전달된다.
* View convertView : 전달되는 뷰는 현재 인덱스에 해당하는 뷰 객체를 의미하는데 안드로이드에서는 선택 위젯이 데이터가 많아 스크롤 될 때 뷰를 재활용하는 메커니즘을 가지고 있어 한 번 만들어진 뷰가 화면 상에 그대로 다시 보일 수 있도록 하고 있다. 따라서 이 뷰가 널 값이 아니면 재활용할 수 있는 것이다. 예를 들어 리스트가 100 개의 아이템을 가지고 있는데 화면에서 보여줄 수 있는 아이템의 개수가 4개면 이 4개의 아이템이 먼저 보여진 후 스크롤 될 때마다 이미 만들어진 4개의 뷰들을 그대로 사용하면서 데이터만 바꾸어 보여주는 방식이다.
* ViewGroup parent : 이 뷰를 포함하고 있는 부모 컨테이너 객체이다.

# ListView 사용하기

ListView를 레이아웃에 넣으세요.

```
 <ListView
        android:id="@+id/listView"
        android:layout_width="match_parent"
        android:layout_height="match_parent" />
```

아래의 코드로 어댑터와 연결하세요.
```
listView.setAdapter(singerAdapter);
```



