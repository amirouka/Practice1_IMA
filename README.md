Глава 1. Настройка среды разработки Android Studio.
Запуск среды разработки:
![Image](https://github.com/user-attachments/assets/927061d0-ea46-4f92-8901-7180d42c42df)
Установка необходимых версиий Android SDK:
![Снимок 07 03 2025 в 21 00](https://github.com/user-attachments/assets/8740040a-1501-4d36-ba5a-b5cad0245f98)
Установка различного инструментария для обеспечения процесса разработки мобильных приложений
![Снимок 07 03 2025 в 21 01](https://github.com/user-attachments/assets/5c530f94-8170-474d-8dd0-79b65c179c14)
Глава 2. Введение в создание приложений
Был создан новый проект, далее выбран шаблон «Empty Views Activity».
![Снимок 07 03 2025 в 21 05](https://github.com/user-attachments/assets/2de85719-0383-494b-8ee6-4f9437ddbe4f)
Далее были определены параметры проекта:
![Снимок 07 03 2025 в 21 07](https://github.com/user-attachments/assets/df9496da-0788-4660-bb0e-94c3dca000c3)
После был создан новый модуль LayoutType:
![Снимок 07 03 2025 в 21 12](https://github.com/user-attachments/assets/b283d0c9-cb5b-407e-a77a-b17c78ae71f4)
Для тестирования приложение возможно использование эмулятора Android устройства, встроенного в Android Studio. Переход в настройки эмулятора:
![Снимок 07 03 2025 в 21 20](https://github.com/user-attachments/assets/02491afd-9495-488e-a9b9-9bc02fade081)
Экран менеджера виртуальных устройств, в котором отображаются созданные ранее виртуальные устройства.
![Снимок 07 03 2025 в 21 21](https://github.com/user-attachments/assets/1f9eb1b4-2209-46be-a349-132b93c6d3fc)
После нажатия кнопки «Create device» отобразился экран:
![Снимок 07 03 2025 в 21 21 (1)](https://github.com/user-attachments/assets/066c271b-5fa3-49fe-9bce-6eea85f0b3bd)
После было создано устройство Pixel 9
![Снимок 07 03 2025 в 21 23](https://github.com/user-attachments/assets/95e4b738-bd26-4387-9a69-dbcfb703b37d)
После создания эмулятора в менеджере виртуальных устройств отобразилось созданное устройство
![Снимок 07 03 2025 в 21 28](https://github.com/user-attachments/assets/94955a00-eb25-4d52-b8a6-e14e201cb67f)
После успешной сборки, приложение отобразилось на экране эмулятора
![Снимок 07 03 2025 в 21 29](https://github.com/user-attachments/assets/b67cf629-f59d-4308-be17-f3e7fae7d5a9)

Глава 3. Компоненты экрана и их свойства
В режиме отображения структуры проекта «Android» в модуле «layouttype» был открыт файл «activity_main.xml», находящийся в папке «res>layout».
![Снимок 07 03 2025 в 21 58](https://github.com/user-attachments/assets/b841f446-5f09-454c-8b72-4719eb20c568)
Окно редактирования экранов разметки. Изменения макетов возможно осуществлять с помощью изменений в xml-файле во вкладке «Сode» или с помощью графического редактора «Design».
![Снимок 07 03 2025 в 22 03](https://github.com/user-attachments/assets/f4847ce7-64ca-43e9-b6ac-14bf6c7a0d41)
ЗАДАНИЕ. Самостоятельно был добавлен элемент TextView на экран и изменен отображаемый текст. Результат:
![Снимок 07 03 2025 в 22 04](https://github.com/user-attachments/assets/8bedfe6d-4cca-4353-9b0f-f504f30181d5)
Глава 4. Виды Layout. Ключевые отличия и свойства
ЗАДАНИЕ. Была выделена папка «res/layout» и создан новый «Layout resource file» с именем «linear_layout.xml». Результат:
![Снимок 07 03 2025 в 22 11](https://github.com/user-attachments/assets/e162f11e-8d5d-4370-b528-b3d2c1b5d809)
![Снимок 12 03 2025 в 19 52](https://github.com/user-attachments/assets/87e81b39-a55a-4d83-8945-241f0fdd98ba)

ЗАДАНИЕ. Создать экран, приведенный на примере из файла. Результат:
![Снимок 07 03 2025 в 22 19](https://github.com/user-attachments/assets/f7ecf90d-80f6-4742-86a1-c5afb6244352)
ЗАДАНИЕ. Создать TableLayout и экран, приведенный на примере из файла. Результат:
![Снимок 07 03 2025 в 22 48](https://github.com/user-attachments/assets/f9bdf090-c4e8-4ecb-880d-dcd0555c327d)
ЗАДАНИЕ. Добавить на экран несколько элементов и привязать их между собой. Результат:
![Снимок 07 03 2025 в 22 59](https://github.com/user-attachments/assets/d48449e6-22a0-4865-9fec-4e64b00873c2)
ЗАДАНИЕ. Создать новый модуль «control_lesson1». Открыть разметку «activity_main.xml» (res>layout) из меню palette перенести следующие элементы и изучить их свойства (область «attributes»):
- Text>textView, plainText (editText) и т.д.;
- Buttons>button, imageButton, checkBox и т.д.;
- Widgets>imageview (установить изображение) и т.д..
Требуется создать собственный экран с использованием изученных элементов. Результат:
![Снимок 12 03 2025 в 19 57](https://github.com/user-attachments/assets/8a93d409-cb08-4b26-8021-7b08fa0cd151)
![Снимок 12 03 2025 в 19 57 (1)](https://github.com/user-attachments/assets/fa0c2b3f-a861-4edc-979d-250710c80c6a)
Глава 5. Layout-файл в Activity.Смена ориентации экрана
ЗАДАНИЕ. Создать layout-файл «activity_second.xml».В созданном layout-файле необходимо добавить на экран элемент «PlainText» и изменить его текст на: «New life for mirea activity!» и 6 кнопок button.
![Снимок 12 03 2025 в 20 00](https://github.com/user-attachments/assets/6a7e7272-b79c-4c74-8bde-db39fc4853c2)
![Снимок 12 03 2025 в 20 06](https://github.com/user-attachments/assets/de064596-1798-40ff-9c38-d8c0d67a46be)
Для того, чтобы activity использовало новый файл «activity_second.xml», а не «activity_main.xml», требовалось открыть «MainActivity.java» и изменить аргумент метода setContentView
![Снимок 12 03 2025 в 20 02](https://github.com/user-attachments/assets/2938f2e1-68f8-42aa-8c76-fef985c1b0a7)
ЗАДАНИЕ. Требуется открыть файл activity_second.xml (land) и изменить расположение кнопок так, чтобы все из них были отображены. Открыть модуль «control_lesson1». Добавить горизонтальную разметку. Результат:
![Снимок 12 03 2025 в 20 05](https://github.com/user-attachments/assets/2875fa66-24f6-4c0b-879c-7641fe5c266b)
Глава 6. Обращение из кода к элементам экрана. Обработчики событий.
В файле activity_main.xml для элемента «TextView» требуется указать:
![Снимок 12 03 2025 в 20 09](https://github.com/user-attachments/assets/0f12d712-afb5-4d07-9bd6-63f0548e6a0e)
Требуется добавить в класс «MainActivity.java» после метода связывания файла разметки «setContentView» создание объекта «TextView»:
![Снимок 12 03 2025 в 20 10](https://github.com/user-attachments/assets/6cb1204a-67fb-4f84-8434-a1f5ff9f9364)
После успешной инициализации возможно применять к «myTextView» методы класса «TextView». Для примера используется метод setText:
![Снимок 12 03 2025 в 20 11](https://github.com/user-attachments/assets/2ddb5b12-ecf4-46b2-8107-6726eab0ac7b)
В файл разметки требуется добавить кнопку «Button» и установить идентификатор «id=@+id/button», а в классе «MainActivity» создать переменную типа «Button». Вызов метода «setText» с аргументом изменит значение текста кнопки:
![Снимок 12 03 2025 в 20 12](https://github.com/user-attachments/assets/dbeba729-eb58-43dd-b675-6ef99ffa4f6c)
![Снимок 12 03 2025 в 20 12 (1)](https://github.com/user-attachments/assets/85aee088-921e-40f5-ae98-e79e957d938b)
Элемент «CheckBox» также требует установки идентификатора «id=@+id/check_box». Для установки метки используется метод «setChecked», меняющий параметр на значение «Checked».
![Снимок 12 03 2025 в 20 13](https://github.com/user-attachments/assets/0cba8076-8c40-4c2c-985e-a63f3f7da182)
![Снимок 12 03 2025 в 20 13 (1)](https://github.com/user-attachments/assets/ddf23c37-1b90-4f63-a211-34816bb59a45)
Итог:
![Снимок 12 03 2025 в 20 14](https://github.com/user-attachments/assets/8e25ee20-2d14-403e-8c90-59e1c3ffa4c1)

Глава 7. Обработчики событий
ЗАДАНИЕ. Требуется создать новый модуль. Название проекта «ButtonClicker». Результат:
![Снимок 12 03 2025 в 20 16](https://github.com/user-attachments/assets/a7540981-fd14-485e-9d5c-a1b96cda986f)
Требуется открыть разметку «activity_main.xml» и добавить «TextView» с идентификатором «id="@+id/tvOut"» и две кнопки: «WhoAmI» (id="@+id/btnWhoAmI") и «ItIsNotMe» (id="@+id/btnItIsNotMe ").
![Снимок 12 03 2025 в 20 17 (1)](https://github.com/user-attachments/assets/9590a585-7f7d-487a-bc06-228b9329f30a)
![Снимок 12 03 2025 в 20 17](https://github.com/user-attachments/assets/84e170e0-c830-4c65-9850-fed2d733ad57)
ЗАДАНИЕ. Требуется, чтобы по нажатию кнопки менялось содержимое «TextView». По нажатию кнопки «WhoAmI» – выводится текст: «Мой номер по списку No Х (по журналу)», по нажатию « ItIsNotMe» – «Это не я сделал».
Код для инициализации объектов:
![Снимок 12 03 2025 в 20 20](https://github.com/user-attachments/assets/89d38886-39d3-487c-b69b-0ef7416595d1)
После создан данный объект в методе «onCreate»:
![Снимок 12 03 2025 в 20 21](https://github.com/user-attachments/assets/f79a71aa-5f39-4bd3-bffa-c3817ebd0af3)
Далее был передан обработчик нажатия кнопки с помощью метода «setOnClickListener».
![Снимок 12 03 2025 в 20 22](https://github.com/user-attachments/assets/fa4adf79-ceb4-4b32-ba82-5e7827f8eb57)
ЗАДАНИЕ. Создайте обработчик события для кнопки «btnItIsNotMe» вторым способом. Добавьте элемент «CheckBox» изменяющий свое состояние при нажатии на кнопки вместе «TextView». Результат:
Код MainActivity:
![Снимок 12 03 2025 в 20 23](https://github.com/user-attachments/assets/859e4bee-5ed4-43e6-971a-dfca6d24c1ba)

Вывод (при нажатии "WHO AM I")

![Снимок 12 03 2025 в 20 24](https://github.com/user-attachments/assets/00613308-fcec-48cf-80c4-512f28eef6d5)

Вывод (при первом нажатии "IT'S NOT ME")

![Снимок 12 03 2025 в 20 24 (1)](https://github.com/user-attachments/assets/8900db49-df33-4f76-91f2-ee8a13f14e64)

Вывод (при втором нажатии "IT'S NOT ME")

![Снимок 12 03 2025 в 20 24 (2)](https://github.com/user-attachments/assets/0e3a27e1-b12c-4358-8fb7-22e219cf8a41)


