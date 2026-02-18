package mentoring.Practice15_ProjectPatterns.video.structural.facade.before;

public class Main {
    public static void main(String[] args){

        // Алгоритм обработки видео
        VideoFile videoFile = new VideoFile("example.mp4");
        videoFile.load();
        CodecConverter codecConverter = new CodecConverter();
        codecConverter.convert(videoFile.fileName);
        AudioMixer audioMixer = new AudioMixer();
        audioMixer.fixAudio();
    }
}