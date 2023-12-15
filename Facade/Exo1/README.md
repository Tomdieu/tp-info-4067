# Facade Pattern

The Facade pattern is a structural design pattern that provides a simplified interface to a complex system. It defines a single class, called a facade, which represents an interface to a group of classes. The facade class hides the complexity of the underlying system and provides a simpler interface for clients to interact with.

## When to use the Facade pattern

- When you want to provide a simple interface to a complex subsystem.
- When you want to structure a subsystem into layers.
- When you don’t want clients to depend on subsystem components.
- When you want to reduce dependencies between clients and subsystems.

## How to implement the Facade pattern

1. Identify a more complex subsystem that you want to simplify.

2. Declare a facade class that provides a simple interface to the subsystem.

3. In the facade class, initialize the subsystem and delegate client requests to it.

4. Clients should interact with the facade only, so instantiate it and use it in the client code.

## Example

The Facade pattern is commonly used in libraries and frameworks to simplify complex subsystems. For example, in the following code snippet, we have a facade class that provides a simple interface to a complex video conversion framework. The facade class hides the complexity of the framework and provides a simple interface for clients to convert videos.

```java

public class VideoConversionFacade {
    public File convertVideo(String fileName, String format) {
        System.out.println("VideoConversionFacade: conversion started.");
        VideoFile file = new VideoFile(fileName);
        Codec sourceCodec = CodecFactory.extract(file);
        Codec destinationCodec;
        if (format.equals("mp4")) {
            destinationCodec = new MPEG4CompressionCodec();
        } else {
            destinationCodec = new OggCompressionCodec();
        }
        VideoFile buffer = BitrateReader.read(file, sourceCodec);
        VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);
        File result = (new AudioMixer()).fix(intermediateResult);
        System.out.println("VideoConversionFacade: conversion completed.");
        return result;
    }
}


```

## References

<https://refactoring.guru/design-patterns/facade>
