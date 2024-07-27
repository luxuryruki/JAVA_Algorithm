# JAVA_Algorithm
Algorithm Study

# Utility Functions

### Math`
Math.max(a, b): 두 값 중 큰 값을 반환합니다.
Math.min(a, b): 두 값 중 작은 값을 반환합니다.
Math.abs(a): 절대값을 반환합니다.
Math.sqrt(a): 제곱근을 반환합니다.
Math.pow(a, b): a의 b 제곱을 반환합니다.

### Arrays
Arrays.sort(array): 배열을 정렬합니다.
Arrays.binarySearch(array, key): 배열에서 이진 탐색을 수행합니다.
Arrays.copyOf(array, newLength): 배열을 복사합니다.
Arrays.toString(array): 배열을 문자열로 변환합니다.

### Collections   
Collections.sort(list): 리스트를 정렬합니다.
Collections.reverse(list): 리스트의 순서를 반전시킵니다.
Collections.max(collection): 컬렉션에서 최대 값을 찾습니다.
Collections.min(collection): 컬렉션에서 최소 값을 찾습니다.
Collections.unmodifiableList(list): 변경 불가능한 리스트를 반환합니다.
Collections.synchronizedList(list): 동기화된 리스트를 반환합니다.
Collections.shuffle(list): 리스트의 요소들을 무작위로 섞습니다.
Collections.frequency(collection, element): 컬렉션에서 특정 요소의 빈도수를 반환합니다.

### String
String.valueOf(obj): 객체를 문자열로 변환합니다.
String.format(format, args): 지정된 형식으로 문자열을 구성합니다.
String.join(delimiter, elements): 주어진 요소들을 구분자로 연결한 문자열을 반환합니다.
String.replace(oldChar, newChar): 문자열 내의 모든 특정 문자를 다른 문자로 대체합니다.
String.substring(beginIndex, endIndex): 문자열의 일부를 추출합니다.

### Integer
Integer.parseInt(s): 문자열을 정수로 변환합니다.
Integer.toString(i): 정수를 문자열로 변환합니다.
Integer.compare(x, y): 두 정수를 비교합니다.
Integer.valueOf(s): 문자열을 Integer 객체로 변환합니다.

### Files
Files.readAllBytes(path): 파일의 모든 바이트를 읽어들입니다.
Files.readAllLines(path): 파일의 모든 라인을 읽어들입니다.
Files.write(path, bytes): 바이트 배열을 파일에 씁니다.
Files.copy(source, target): 파일을 복사합니다.
Files.move(source, target): 파일을 이동 또는 이름을 변경합니다.


### Date
LocalDate.now(): 현재 날짜를 반환합니다.
LocalDate.of(year, month, dayOfMonth): 특정 날짜를 생성합니다.
LocalDate.parse(text): 문자열을 날짜로 변환합니다.
Duration.between(start, end): 두 시간 사이의 기간을 반환합니다.
Instant.now(): 현재 시간을 타임스탬프로 반환합니다.

### Optional
Optional.of(value): 값이 존재하는 Optional 객체를 생성합니다.
Optional.empty(): 빈 Optional 객체를 생성합니다.
Optional.isPresent(): 값이 존재하는지 여부를 반환합니다.
Optional.ifPresent(consumer): 값이 존재하는 경우 주어진 동작을 수행합니다.
Optional.orElse(other): 값이 존재하지 않는 경우 대체 값을 반환합니다.