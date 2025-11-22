package Practice15_ProjectPatterns.video.structural.facade.after;

public class Main {
    public static void main(String[] args){

        // Алгоритм обработки видео
//        VideoFile videoFile = new VideoFile("example.mp4");
//        videoFile.load();
//        CodecConverter codecConverter = new CodecConverter();
//        codecConverter.convert(videoFile.fileNme);
//        AudioMixer audioMixer = new AudioMixer();
//        audioMixer.fixAudio();
        // из этого нужно только
        VideoFile videoFile = new VideoFile("example.mp4");
        CodecConverter codecConverter = new CodecConverter();
        AudioMixer audioMixer = new AudioMixer();

        MultimediaFacade multimediaFacade = new MultimediaFacade(videoFile, codecConverter, audioMixer);

        multimediaFacade.prepareData();
    }
}