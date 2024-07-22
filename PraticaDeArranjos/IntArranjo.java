import java.util.Arrays;

class IntArranjo extends Arranjo<Integer> {
    public IntArranjo(int capacity) {
        super(Integer.class, capacity);
    }

    @Override
    public void classificar() {
        Arrays.sort(elements, 0, size, (a, b) -> b - a);
    }
}

class FloatArranjo extends Arranjo<Float> {
    public FloatArranjo(int capacity) {
        super(Float.class, capacity);
    }


    public void classificar() {
        Arrays.sort(elements, 0, size, (a, b) -> Float.compare(b, a));
    }
}

class DoubleArranjo extends Arranjo<Double> {
    public DoubleArranjo(int capacity) {
        super(Double.class, capacity);
    }


    public void classificar() {
        Arrays.sort(elements, 0, size, (a, b) -> Double.compare(b, a));
    }
}

class ByteArranjo extends Arranjo<Byte> {
    public ByteArranjo(int capacity) {
        super(Byte.class, capacity);
    }


    public void classificar() {
        Arrays.sort(elements, 0, size, (a, b) -> Byte.compare(b, a));
    }
}

class ShortArranjo extends Arranjo<Short> {
    public ShortArranjo(int capacity) {
        super(Short.class, capacity);
    }


    public void classificar() {
        Arrays.sort(elements, 0, size, (a, b) -> Short.compare(b, a));
    }
}

class LongArranjo extends Arranjo<Long> {
    public LongArranjo(int capacity) {
        super(Long.class, capacity);
    }


    public void classificar() {
        Arrays.sort(elements, 0, size, (a, b) -> Long.compare(b, a));
    }
}

class CharArranjo extends Arranjo<Character> {
    public CharArranjo(int capacity) {
        super(Character.class, capacity);
    }

    public void classificar() {
        Arrays.sort(elements, 0, size, (a, b) -> Character.compare(b, a));
    }
}
