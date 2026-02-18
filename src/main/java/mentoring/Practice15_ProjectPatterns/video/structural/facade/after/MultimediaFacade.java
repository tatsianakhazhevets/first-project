package mentoring.Practice15_ProjectPatterns.video.structural.facade.after;

/*
фасад для сложной обработки файла
 */

public class MultimediaFacade {
    private VideoFile videoFile;
    private CodecConverter codecConverter;
    private AudioMixer audioMixer;

    public MultimediaFacade(VideoFile videoFile, CodecConverter codecConverter, AudioMixer audioMixer) {
        this.videoFile = videoFile;
        this.codecConverter = codecConverter;
        this.audioMixer = audioMixer;
    }
    // алгоритм обработки видео вынесен в фасад
    public void prepareData() {
        videoFile.load();
        codecConverter.convert(videoFile.fileName);
        audioMixer.fixAudio();
    }
}
