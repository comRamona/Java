package game;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.particles.ConfigurableEmitter;
import org.newdawn.slick.particles.ParticleEmitter;
import org.newdawn.slick.particles.ParticleSystem;

public class BaseParticle {

    private float x;
    private float y;
    private float angle;
    private boolean completed;
    private ParticleSystem system;
    private ParticleEmitter emitter;
    private int maxLifeTime;
    private int lifeTime;
    private float centerXAdd;
    private float centerYAdd;
    private boolean lifeForever;

    public BaseParticle(ConfigurableEmitter emitter) {
            this(new ParticleSystem(ResourceManager
                            .getImage("defaultParticleImage"), (int) emitter.spawnCount
                            .getMax()), emitter, 0);
            this.lifeForever = true;
    }

    public BaseParticle(ParticleEmitter emitter, int numParticle) {
            this(new ParticleSystem(ResourceManager
                            .getImage("defaultParticleImage"), numParticle), emitter, 0);
            this.lifeForever = true;
    }

    public BaseParticle(ConfigurableEmitter emitter, int maxLifeTime) {
            this(new ParticleSystem(ResourceManager
                            .getImage("defaultParticleImage"), (int) emitter.spawnCount
                            .getMax()), emitter, maxLifeTime);
    }

    public BaseParticle(ParticleEmitter emitter, int numParticle,
                    int maxLifeTime) {
            this(new ParticleSystem(ResourceManager
                            .getImage("defaultParticleImage"), numParticle), emitter,
                            maxLifeTime);
    }

    public BaseParticle(ParticleSystem system, ParticleEmitter emitter,
                    int maxLifeTime) {
            this.system = system;
            this.emitter = emitter;
            this.maxLifeTime = maxLifeTime;
            this.system.addEmitter(emitter);
            this.system.setRemoveCompletedEmitters(true);
    }

    public void update(int delta) {
            if (!lifeForever && lifeTime > maxLifeTime) {
                    completed = true;
            }

            updateParticle(delta);
            lifeTime += delta;
    }

    protected void updateParticle(int delta) {
            system.update(delta);
    }


    protected void renderParticle(Graphics g, float Something) {
            system.render(Something + centerXAdd, Something + centerYAdd);
    }

    public boolean isCompleted() {
            return completed;
    }

    public void setPosition(float x, float y, float angle) {
            this.x = x;
            this.y = y;
            this.angle = angle;
    }

    public void addPosToDrawCenter(float xadd, float yadd) {
            centerXAdd = xadd;
            centerYAdd = yadd;
    }

    public ParticleEmitter getEmitter() {
            return emitter;
    }
}
